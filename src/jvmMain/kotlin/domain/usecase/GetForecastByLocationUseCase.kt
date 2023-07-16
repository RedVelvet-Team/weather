package domain.usecase

import domain.repository.WeatherRepository


class GetForecastByLocationUseCase(private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(latitude :Double, longitude:Double){
        return weatherRepository.getForecastWeatherByLocation(latitude = latitude, longitude = longitude)
    }
}