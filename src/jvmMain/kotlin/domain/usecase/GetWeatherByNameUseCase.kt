package domain.usecase

import domain.repository.WeatherRepository

class GetWeatherByNameUseCase(private val iWeatherRepository: WeatherRepository) {
//    suspend operator fun invoke(cityName: String){
//        return iWeatherRepository.getCurrentWeatherByName(cityName = cityName)
//    }
}