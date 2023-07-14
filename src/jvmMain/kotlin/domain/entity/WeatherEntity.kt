package domain.entity

data class WeatherEntity(
    val current: CurrentWeatherEntity?,
    val location: LocationEntity?
)

data class ConditionEntity(
    val code: Int?,
    val icon: String?,
    val text: String?
)

