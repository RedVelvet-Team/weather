package domain.usecase

import domain.repository.WeatherRepository

class GetForecastByNameUseCase(private val iWeatherRepository: WeatherRepository) {

//    suspend operator fun invoke(cityName: String){
//        return iWeatherRepository.getWeatherForecast()
//    }
}