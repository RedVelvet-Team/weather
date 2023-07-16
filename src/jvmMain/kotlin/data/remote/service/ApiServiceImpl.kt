package data.remote.service

import app.util.HttpRoute
import data.remote.dto.forecast.ForecastDTO
import data.remote.dto.weather.WeatherDTO
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

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
                parameter("key", HttpRoute.API_KEY)
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
                parameter("key", HttpRoute.API_KEY)
                parameter("q", query)
                parameter("days", days ?: 1)
            }
        }
    }

    private suspend inline fun <reified T> wrapResponse(block: () -> HttpResponse): T {
        val response = block()
        if (response.status.isSuccess()) return response.body()
        else throw apiExceptionHandler.getWeatherAppException(response.status)
    }
}