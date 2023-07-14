package domain.usecase

import domain.repository.IWeatherRepository

class GetForecastByLocationUseCase(private val iWeatherRepository: IWeatherRepository) {

    suspend operator fun invoke(latitude :Double, longitude:Double){
        return iWeatherRepository.getForecastWeatherByLocation(latitude = latitude, longitude = longitude)
    }
}