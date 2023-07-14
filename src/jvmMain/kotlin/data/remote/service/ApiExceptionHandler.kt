package data.remote.service

import domain.util.WeatherAppException
import io.ktor.http.*

interface ApiExceptionHandler {
    fun getWeatherAppException(statusCode: HttpStatusCode): WeatherAppException
}