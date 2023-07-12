package data.remote.dto



@kotlinx.serialization.Serializable
data class DaysWeatherDto(
    val current: CurrentDto?,
    val forecast: ForecastDto?,
    val location: LocationDto?
)