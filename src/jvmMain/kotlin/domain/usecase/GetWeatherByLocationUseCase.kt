package domain.usecase

import domain.entity.weather.WeatherEntity
import domain.repository.WeatherRepository

class GetWeatherByLocationUseCase(private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(location: String): WeatherEntity {
        return weatherRepository.getCurrentWeatherByLocation(location = location)
    }
}