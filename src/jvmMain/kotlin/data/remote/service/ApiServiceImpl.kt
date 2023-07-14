package data.remote.service

import app.util.HttpRoute
import data.remote.dto.ForecastDto
import data.remote.dto.SearchDto
import data.remote.dto.WeatherDto
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

class ApiServiceImpl(
    private val client: HttpClient,
    private val apiExceptionHandler: ApiExceptionHandler
) : ApiService {
    override suspend fun getCurrentWeather(
        query: String,
        getAirQuality: String?,
    ): WeatherDto {
        return wrapResponse {
            client.get {
                url(HttpRoute.CURRENT_WEATHER)
                parameter("q", query)
                parameter("aqi", getAirQuality ?: "no")
            }
        }
    }

    override suspend fun getWeatherForecast(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?
    ): ForecastDto {
        return wrapResponse {
            client.get {
                url(HttpRoute.FORECAST_WEATHER)
                parameter("q", query)
                parameter("days", days ?: 1)
                parameter("aqi", getAirQuality ?: "no")
                parameter("alerts", getWeatherAlerts ?: "no")
            }
        }
    }

    override suspend fun search(query: String): List<SearchDto> {
        return wrapResponse {
            client.get {
                url(HttpRoute.SEARCH_WEATHER)
                parameter("q", query)
            }
        }
    }

    private suspend inline fun <reified T> wrapResponse(block: () -> HttpResponse): T {
        try {
            val response = block()
            if (response.status.isSuccess()) return response.body()
            else throw apiExceptionHandler.getWeatherAppException(response.status)
        } catch (e: ResponseException) {
            throw apiExceptionHandler.getWeatherAppException(e.response.status)
        }
    }
}