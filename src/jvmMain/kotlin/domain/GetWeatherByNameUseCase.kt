package domain

import domain.repository.IWeatherRepository

class GetWeatherByNameUseCase(private val iWeatherRepository: IWeatherRepository) {
    suspend operator fun invoke(cityName: String){
        return iWeatherRepository.getCurrentWeatherByName(cityName = cityName)
    }
}