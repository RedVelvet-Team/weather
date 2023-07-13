package data.remote.repository
import data.remote.service.ApiService
import domain.repository.WeatherRepository

class WeatherRepositoryImpl (private val apiService: ApiService):WeatherRepository {
    override suspend fun getCurrentWeather(query: String, getAirQuality: String?) {
         apiService.getCurrentWeather(query, getAirQuality)
    }

    override suspend fun getWeatherForecast(
        query: String,
        days: Int?,
        getAirQuality: String?,
        getWeatherAlerts: String?
    ) {
        apiService.getWeatherForecast(query, days, getAirQuality, getWeatherAlerts)
    }

    override suspend fun search(query: String) {
        apiService.search(query)
    }
}