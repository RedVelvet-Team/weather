package domain.entity

import data.remote.dto.CurrentDto
import data.remote.dto.ForecastDto
import data.remote.dto.LocationDto

data class DaysWeatherEntity(
    val current: CurrentDto?,
    val forecast: ForecastDto?,
    val location: LocationDto?
)
