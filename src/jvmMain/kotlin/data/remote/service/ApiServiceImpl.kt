package data.remote.service

import app.util.HttpRoute
import data.remote.dto.ForecastDto
import data.remote.dto.SearchDto
import data.remote.dto.WeatherDto
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class ApiServiceImpl(
    private val client: HttpClient
) : ApiService {
    override suspend fun getCurrentWeather(
        query: String,
        getAirQuality: String?,
    ): WeatherDto {
        return client.get {
            url(HttpRoute.CURRENT_WEATHER)
            parameter("q", query)
            parameter("aqi", getAirQuality ?: "no")
        }.body()
    }

    override suspend fun getWeatherForecast(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?
    ): ForecastDto {
        return client.get {
            url(HttpRoute.FORECAST_WEATHER)
            parameter("q", query)
            parameter("days", days ?: 1)
            parameter("aqi", getAirQuality ?: "no")
            parameter("alerts", getWeatherAlerts ?: "no")
        }.body()
    }

    override suspend fun search(query: String): List<SearchDto> {
        return client.get {
            url(HttpRoute.SEARCH_WEATHER)
            parameter("q", query)
        }.body()
    }
}