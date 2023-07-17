package data.remote.service

import com.google.gson.Gson
import data.remote.dto.forecast.ForecastDTO
import data.remote.dto.weather.WeatherDTO
import data.util.HttpRoute
import domain.entity.location.Location
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import java.net.URL

class ApiServiceImpl(
    private val client: HttpClient,
    private val apiExceptionHandler: ApiExceptionHandler,
) : ApiService {
    override suspend fun getCurrentWeather(
        query: String,
    ): WeatherDTO {
        return wrapResponse {
            client.get {
                url(HttpRoute.CURRENT_WEATHER)
                parameter("key", "e803fb0588cf45e1a78121355231107")
                parameter("q", query)
            }
        }
    }

    override suspend fun getWeatherForecast(
        query: String,
        days: Int?,
    ): ForecastDTO {
        return wrapResponse {
            client.get {
                url(HttpRoute.FORECAST_WEATHER)
                parameter("q", query)
                parameter("days", days ?: 5)
            }
        }
    }

    override suspend fun getLocation(): Location {
        val url = URL("https://ipinfo.io/json/")
        val json = url.readText()
        val data = Gson().fromJson(json, Location::class.java)
        val location = data.loc
        return Location(loc = location)
    }

    private suspend inline fun <reified T> wrapResponse(block: () -> HttpResponse): T {
        try {
            val response = block()
            if (response.status.isSuccess())
                return response.body()
            throw apiExceptionHandler.getWeatherAppException(response.status)
        } catch (e: RedirectResponseException) {//3xx
            throw apiExceptionHandler.getWeatherAppException(e.response.status)
        } catch (e: ClientRequestException) {//4xx
            throw apiExceptionHandler.getWeatherAppException(e.response.status)
        } catch (e: ServerResponseException) {//5xx
            throw apiExceptionHandler.getWeatherAppException(e.response.status)
        } catch (e: Exception) {
            throw Exception(e.message.toString())
        }
    }
}