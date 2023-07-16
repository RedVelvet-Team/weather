package domain.usecase

import domain.entity.forecast.ForecastEntity
import domain.repository.WeatherRepository


class GetForecastByLocationUseCase(private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(location: String, days: Int): ForecastEntity {
        return weatherRepository.getWeatherForecastByLocation(location = location, days = days)
    }
}