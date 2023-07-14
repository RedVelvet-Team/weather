package domain.entity


data class DaysWeatherEntity(
    val current: CurrentWeatherEntity?,
    val forecast: ForecastEntity?,
    val location: LocationEntity?
)
