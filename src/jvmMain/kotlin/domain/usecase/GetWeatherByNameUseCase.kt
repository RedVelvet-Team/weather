package domain.usecase


import domain.entity.weather.WeatherEntity
import domain.repository.WeatherRepository

class GetWeatherByNameUseCase(private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(cityName: String): WeatherEntity {
        return weatherRepository.getCurrentWeatherByName(cityName = cityName)
    }
}