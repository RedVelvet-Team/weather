package domain.util

import java.lang.Exception

sealed class WeatherAppException : Exception() {
    object UnAuthorized : WeatherAppException()

    object BadRequest : WeatherAppException()

    object InternalServerError : WeatherAppException()

    object NoInternetConnection : WeatherAppException()
}