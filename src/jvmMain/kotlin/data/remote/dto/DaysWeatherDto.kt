package data.remote.dto




data class DaysWeatherDto(
    val current: CurrentDto?,
    val forecast: ForecastDto?,
    val location: Location?
)