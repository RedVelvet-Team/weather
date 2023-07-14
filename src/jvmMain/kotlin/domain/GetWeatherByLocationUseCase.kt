package domain

import domain.repository.IWeatherRepository

class GetWeatherByLocationUseCase(private val iWeatherRepository: IWeatherRepository) {
    suspend operator fun invoke(latitude :Double, longitude:Double){
        return iWeatherRepository.getCurrentWeatherByLocation(latitude = latitude, longitude = longitude)
    }
}