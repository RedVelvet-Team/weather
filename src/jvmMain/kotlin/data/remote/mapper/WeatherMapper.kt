package data.remote.mapper

import data.remote.dto.WeatherDto
import domain.Weather

fun List<WeatherDto>.mapToDomainModel() =
    map {
        Weather(
            location = Weather.Location(
                name = it.location?.name ?: "",
                region = it.location?.region ?: "",
                country = it.location?.country ?: "",
                lat = it.location?.lat ?: 0.0,
                lon = it.location?.lon ?: 0.0,
                localtime = it.location?.localtime ?: ""
            ),
            condition = Weather.Condition(
                text = it.current?.condition?.text ?: "",
                icon = it.current?.condition?.icon ?: "",
                code = it.current?.condition?.code ?: 0
            ),
            current = Weather.Current(
                lastUpdated = it.current?.lastUpdated ?: "",
                tempC = it.current?.tempC ?: 0.0,
                tempF = it.current?.tempF ?: 0.0,
                isDay = it.current?.isDay ?: 0,
                windMph = it.current?.windMph ?: 0.0,
                windKph = it.current?.windKph ?: 0.0,
                windDegree = it.current?.windDegree ?: 0,
                windDir = it.current?.windDir ?: "",
                pressureMb = it.current?.pressureMb ?: 0.0,
                pressureIn = it.current?.pressureIn ?: 0.0,
                humidity = it.current?.humidity ?: 0,
                cloud = it.current?.cloud ?: 0,
                feelslikeC = it.current?.feelslikeC ?: 0.0,
                feelslikeF = it.current?.feelslikeF ?: 0.0,
                uv = it.current?.uv ?: 0.0
            )
        )
    }