package data.remote.dto.forecast

import data.remote.dto.base.CurrentDTO
import data.remote.dto.base.LocationDTO


data class ForecastDTO(
    val current: CurrentDTO?,
    val forecast: Forecast?,
    val location: LocationDTO?
)

data class Forecast(
    val forecastday: List<ForecastdayDTO>?
)