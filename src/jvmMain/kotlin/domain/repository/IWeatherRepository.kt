package domain.repository

interface IWeatherRepository {

    suspend fun getCurrentWeatherByLocation(latitude: Double, longitude: Double)//return weather entity
    suspend fun getCurrentWeatherByName(cityName: String)//return weather entity
    suspend fun getForecastWeatherByLocation(latitude: Double, longitude: Double)// return forecast entity
    suspend fun getForecastWeatherByName(cityName: String)// return forecast entity

}