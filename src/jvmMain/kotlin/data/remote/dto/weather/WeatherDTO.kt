package data.remote.dto.weather

import data.remote.dto.CurrentDTO
import data.remote.dto.LocationDTO


data class WeatherDTO(
    val current: CurrentDTO?,
    val location: LocationDTO?
)