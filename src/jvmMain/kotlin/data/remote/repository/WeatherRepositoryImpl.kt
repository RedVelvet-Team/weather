package data.remote.repository

import data.remote.mapper.toDomain
import data.remote.service.ApiService
import domain.entity.forecast.ForecastEntity
import domain.entity.weather.WeatherEntity
import domain.repository.WeatherRepository

class WeatherRepositoryImpl(private val apiService: ApiService) : WeatherRepository {
    override suspend fun getCurrentWeatherByLocation(location: String): WeatherEntity {
        return apiService.getCurrentWeather(query = location).toDomain()
    }

    override suspend fun getCurrentWeatherByName(cityName: String): WeatherEntity {
        return apiService.getCurrentWeather(query = cityName).toDomain()
    }

    override suspend fun getWeatherForecastByLocation(
        location: String,
        days: Int?,
    ): ForecastEntity {
        return apiService.getWeatherForecast(location, days).toDomain()
    }

    override suspend fun getWeatherForecastByName(
        cityName: String,
        days: Int?,
    ): ForecastEntity {
        return apiService.getWeatherForecast(cityName, days).toDomain()
    }

    override suspend fun search(query: String) {
        apiService.search(query)
    }
}