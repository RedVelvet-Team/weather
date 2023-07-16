package data.remote.mapper

import data.remote.dto.weather.WeatherDTO
import domain.entity.weather.WeatherEntity

fun WeatherDTO.toDomain() =
    WeatherEntity(
        cloud = current?.cloud,
        conditionCode = current?.conditionDTO?.code,
        conditionIcon = current?.conditionDTO?.icon,
        conditionText = current?.conditionDTO?.text,
        feelslikeC = current?.feelslikeC,
        gustKph = current?.gustKph,
        humidity = current?.humidity,
        lastUpdated = current?.lastUpdated,
        pressureIn = current?.pressureIn,
        tempC = current?.tempC,
        uv = current?.uv,
        visMiles = current?.visMiles,
        windDegree = current?.windDegree,
        windDir = current?.windDir,
        windKph = current?.windKph,
        windMph = current?.windMph,
        country = location?.country,
        lat = location?.lat,
        localtime = location?.localtime,
        lon = location?.lon,
        name = location?.name,
        region = location?.region,
    )
    