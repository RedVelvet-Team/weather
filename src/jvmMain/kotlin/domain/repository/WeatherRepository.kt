package domain.repository

import data.remote.dto.ForecastDto
import data.remote.dto.SearchDto
import data.remote.dto.WeatherDto

interface WeatherRepository {
    suspend fun getCurrentWeather(
        query: String,
        getAirQuality: String?,
    ) //this function return Weather Entity

    suspend fun getWeatherForecast(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?,
    ) //this function return Forecast Entity

    suspend fun search(query: String) //this function return Search Entity
}