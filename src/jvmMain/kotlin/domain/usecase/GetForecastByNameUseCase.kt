package domain.usecase

import domain.repository.IWeatherRepository

class GetForecastByNameUseCase(private val iWeatherRepository: IWeatherRepository) {

    suspend operator fun invoke(cityName: String){
        return iWeatherRepository.getForecastWeatherByName(cityName = cityName)
    }
}