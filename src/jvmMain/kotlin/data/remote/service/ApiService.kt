package data.remote.service

import data.remote.dto.ForecastDto
import data.remote.dto.WeatherDto

interface ApiService {
    suspend fun getCurrentWeatherByLocation(latitude: Double, longitude: Double): WeatherDto
    suspend fun getCurrentWeatherByName(cityName: String): WeatherDto
    suspend fun getForecastWeatherByLocation(latitude: Double, longitude: Double): ForecastDto
    suspend fun getForecastWeatherByName(cityName: String): ForecastDto
}