package domain.repository

import domain.entity.forecast.ForecastEntity
import domain.entity.weather.WeatherEntity

interface WeatherRepository {
    suspend fun getCurrentWeather(
        query: String,
        getAirQuality: String?,
    ): WeatherEntity

    suspend fun getWeatherForecast(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?,
    ): ForecastEntity

    suspend fun search(query: String) //this function return Search Entity
}