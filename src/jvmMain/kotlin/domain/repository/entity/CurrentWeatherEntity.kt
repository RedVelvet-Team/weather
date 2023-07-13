package domain.repository.entity

import data.remote.dto.ConditionDto

data class CurrentWeatherEntity(
    val cloud: Int?,
    val condition: ConditionDto?,
    val feelslikeC: Double?,
    val feelslikeF: Double?,
    val gustKph: Double?,
    val gustMph: Double?,
    val humidity: Int?,
    val isDay: Int?,
    val tempC: Double?,
    val tempF: Double?,
    val windDegree: Int?,
    val windDir: String?,
    val windKph: Double?,
    val windMph: Double?
)
