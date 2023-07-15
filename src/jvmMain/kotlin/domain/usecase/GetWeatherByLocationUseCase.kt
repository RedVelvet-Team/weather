package domain.usecase

import domain.repository.WeatherRepository

class GetWeatherByLocationUseCase(private val iWeatherRepository: WeatherRepository) {
    suspend operator fun invoke(query: String, getAirQuality: String?,){
        return iWeatherRepository.getCurrentWeather(query = query, getAirQuality = getAirQuality)
    }
}