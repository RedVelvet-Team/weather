package data.remote.dto.forecast

import data.remote.dto.base.CurrentDTO
import data.remote.dto.base.LocationDTO
import domain.entity.forecast.ForecastDayEntity


data class ForecastDTO(
    val current: CurrentDTO?,
    val forecast: Forecast?,
    val location: LocationDTO?
)

data class Forecast(
    val forecastday: List<ForecastdayDTO>?
)

fun List<ForecastdayDTO>.toDomain() =
    map {
        ForecastDayEntity(
            astro = it.astro?.toDomain(),
            date = it.date,
            day = it.day?.toDomain(),
            hour = it.hours?.toDomain(),
        )
    }