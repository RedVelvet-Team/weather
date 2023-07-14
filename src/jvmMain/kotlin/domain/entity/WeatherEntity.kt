package domain.entity

data class WeatherEntity(
    val current: CurrentWeatherEntity?,
    val location: LocationEntity?
)

