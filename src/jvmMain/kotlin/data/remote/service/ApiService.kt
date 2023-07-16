package data.remote.service

import data.remote.dto.forecast.ForecastDTO
import data.remote.dto.weather.WeatherDTO

interface ApiService {
    suspend fun getCurrentWeather(
        query: String,
    ): WeatherDTO

    suspend fun getWeatherForecast(
        query: String,
        days: Int?,
    ): ForecastDTO
}