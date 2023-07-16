package data.remote.dto.weather

import data.remote.dto.base.CurrentDTO
import data.remote.dto.base.LocationDTO


data class WeatherDTO(
    val current: CurrentDTO?,
    val location: LocationDTO?
)