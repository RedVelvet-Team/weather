package domain.util

sealed class WeatherAppException : Exception() {
    object UnAuthorized : WeatherAppException()

    object BadRequest : WeatherAppException()

    object InternalServerError : WeatherAppException()

    object NoInternetConnection : WeatherAppException()
}