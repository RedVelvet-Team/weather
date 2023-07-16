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
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?
    ): ForecastEntity {
        TODO("Not yet implemented")
    }

    override suspend fun getWeatherForecastByName(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?
    ): ForecastEntity {
        return apiService.getWeatherForecast(query, days, getAirQuality, getWeatherAlerts).toDomain()
    }

    override suspend fun search(query: String) {
        apiService.search(query)
    }
}