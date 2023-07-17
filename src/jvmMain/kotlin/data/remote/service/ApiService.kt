package data.remote.service

import data.remote.dto.forecast.ForecastDTO
import data.remote.dto.weather.WeatherDTO
import domain.entity.location.Location

interface ApiService {
    suspend fun getCurrentWeather(
        query: String,
    ): WeatherDTO

    suspend fun getWeatherForecast(
        query: String,
        days: Int?,
    ): ForecastDTO

    suspend fun getLocation(): Location
}