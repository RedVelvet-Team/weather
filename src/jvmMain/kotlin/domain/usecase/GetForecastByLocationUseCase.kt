package domain.usecase

import domain.repository.WeatherRepository

class GetForecastByLocationUseCase(private val iWeatherRepository: WeatherRepository) {

    suspend operator fun invoke(query: String, days: Int?, getAirQuality: String?, getWeatherAlerts: String?,){
        return iWeatherRepository.getWeatherForecast(query, days,getAirQuality, getWeatherAlerts)
    }
}