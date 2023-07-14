package data.remote

import domain.Weather

fun List<WeatherDTO>.mapToDomainModel(): List<Weather>{
    return this.map {
        Weather(
            location = Weather.Location(
                name = it.query.location.name,
                region = it.query.location.region,
                country = it.query.location.country,
                lat = it.query.location.lat,
                lon = it.query.location.lon,
                localtime = it.query.location.localtime
            ),
            condition = Weather.Condition(
                text = it.query.current.condition.text,
                icon = it.query.current.condition.icon,
                code = it.query.current.condition.code
            ),
            current = Weather.Current(
                lastUpdated = it.query.current.lastUpdated,
                tempC = it.query.current.tempC,
                tempF = it.query.current.tempF,
                isDay = it.query.current.isDay,
                windMph = it.query.current.windMph,
                windKph = it.query.current.windKph,
                windDegree = it.query.current.windDegree,
                windDir = it.query.current.windDir,
                pressureMb = it.query.current.pressureMb,
                pressureIn = it.query.current.pressureIn,
                humidity = it.query.current.humidity,
                cloud = it.query.current.cloud,
                feelslikeC = it.query.current.feelslikeC,
                feelslikeF = it.query.current.feelslikeF,
                uv = it.query.current.uv
            )
        )
    }
}