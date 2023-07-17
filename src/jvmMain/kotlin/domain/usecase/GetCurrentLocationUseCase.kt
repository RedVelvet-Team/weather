package domain.usecase

import domain.repository.WeatherRepository

class GetCurrentLocationUseCase(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun invoke() = weatherRepository.getLocation().loc
}