package domain.repository

import domain.entity.forecast.ForecastEntity
import domain.entity.weather.WeatherEntity

interface WeatherRepository {
    suspend fun getCurrentWeatherByLocation(
        location: String,
    ): WeatherEntity

    suspend fun getCurrentWeatherByName(
        cityName: String
    ): WeatherEntity

    suspend fun getWeatherForecastByLocation(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?,
    ): ForecastEntity

    suspend fun getWeatherForecastByName(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?,
    ): ForecastEntity

    suspend fun search(query: String) //this function return Search Entity
}