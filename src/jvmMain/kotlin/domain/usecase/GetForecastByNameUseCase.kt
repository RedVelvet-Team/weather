package domain.usecase


import domain.entity.forecast.ForecastEntity
import domain.repository.WeatherRepository

class GetForecastByNameUseCase(private val weatherRepository: WeatherRepository) {

    suspend operator fun invoke(cityName: String, days: Int): ForecastEntity {
        return weatherRepository.getWeatherForecastByName(cityName = cityName, days = days)
    }
}