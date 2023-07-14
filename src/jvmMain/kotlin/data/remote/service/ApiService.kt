package data.remote.service

import data.remote.dto.ForecastDto
import data.remote.dto.SearchDto
import data.remote.dto.WeatherDto

interface ApiService {
    suspend fun getCurrentWeather(
        query: String,
        getAirQuality: String?,
    ): WeatherDto

    suspend fun getWeatherForecast(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?,
    ): ForecastDto

    suspend fun search(query: String): List<SearchDto>
}