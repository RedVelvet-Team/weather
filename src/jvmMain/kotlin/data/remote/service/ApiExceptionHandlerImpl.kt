package data.remote.service

import domain.util.WeatherAppException
import io.ktor.http.*

class ApiExceptionHandlerImpl : ApiExceptionHandler {
    override fun getWeatherAppException(statusCode: HttpStatusCode): WeatherAppException {
        return when (statusCode) {
            HttpStatusCode.Unauthorized,
            HttpStatusCode.Forbidden,
            -> WeatherAppException.UnAuthorized

            HttpStatusCode.BadRequest -> WeatherAppException.BadRequest
            HttpStatusCode.InternalServerError -> WeatherAppException.InternalServerError
            else -> WeatherAppException.NoInternetConnection
        }
    }

}