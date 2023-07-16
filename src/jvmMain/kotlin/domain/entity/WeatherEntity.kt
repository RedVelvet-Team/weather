package domain.entity


data class WeatherEntity(
    val current: CurrentWeatherEntity?,
    val forecast: ForecastEntity?,
    val location: LocationEntity?
)
