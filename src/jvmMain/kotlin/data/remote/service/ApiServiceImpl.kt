package data.remote.service

import data.remote.dto.forecast.ForecastDTO
import data.remote.dto.weather.WeatherDTO
import data.util.HttpRoute
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class ApiServiceImpl(
    private val client: HttpClient,
) : ApiService {
    override suspend fun getCurrentWeather(
        query: String,
    ): WeatherDTO {
        return client.get {
            url(HttpRoute.CURRENT_WEATHER)
            parameter("q", query)
        }.body()
    }

    override suspend fun getWeatherForecast(
        query: String,
        days: Int?,
    ): ForecastDTO {
        return client.get {
            url(HttpRoute.FORECAST_WEATHER)
            parameter("q", query)
            parameter("days", days ?: 1)
        }.body()
    }

//    private suspend inline fun <reified T> wrapResponse(block: () -> HttpResponse): T {
//        val response = block()
//        if (response.status.isSuccess()) return response.body()
//        else throw apiExceptionHandler.getWeatherAppException(response.status)
//    }
}