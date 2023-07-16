package domain.repository

import domain.entity.forecast.ForecastEntity
import domain.entity.weather.WeatherEntity

interface WeatherRepository {
    suspend fun getCurrentWeatherByLocation(
        location: String,
    ): WeatherEntity

    suspend fun getCurrentWeatherByName(
        cityName: String,
    ): WeatherEntity

    suspend fun getWeatherForecastByLocation(
        location: String,
        days: Int?,
    ): ForecastEntity

    suspend fun getWeatherForecastByName(
        cityName: String,
        days: Int?,
    ): ForecastEntity
}