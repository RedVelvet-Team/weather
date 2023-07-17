package data.remote.mapper

import data.remote.dto.forecast.*
import domain.entity.forecast.*

fun ForecastDTO.toDomain() =
    ForecastEntity(
        forecastDay = forecast?.forecastday?.toDomain(),
    )

