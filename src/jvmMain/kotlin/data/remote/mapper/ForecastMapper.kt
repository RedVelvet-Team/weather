package data.remote.mapper

import data.remote.dto.forecast.*
import domain.entity.forecast.*

fun ForecastDTO.toDomain() =
    ForecastEntity(
        forecastDay = forecast?.forecastday?.toDomain(),
    )

private fun List<ForecastdayDTO>.toDomain() =
    map {
        ForecastDayEntity(
            astro = it.astro?.toDomain(),
            date = it.date,
            day = it.day?.toDomain(),
            hour = it.hours?.toDomain(),
        )
    }

private fun AstroDTO.toDomain() =
    AstroEntity(
        moonPhase = moonPhase,
        moonrise = moonrise,
        moonset = moonset,
        sunrise = sunrise,
        sunset = sunset,
    )

private fun DayDTO.toDomain() =
    DayEntity(
        avghumidity = avghumidity,
        avgtempC = avgtempC,
        conditionCode = condition?.code,
        conditionIcon = condition?.icon,
        conditionText = condition?.text,
        dailyChanceOfRain = dailyChanceOfRain,
        dailyWillItRain = dailyWillItRain,
        maxtempC = maxtempC,
        maxwindKph = maxwindKph,
        mintempC = mintempC,
        totalprecipIn = totalprecipIn,
    )

private fun List<HourDTO>.toDomain() =
    map {
        HourEntity(
            chanceOfRain = it.chanceOfRain,
            cloud = it.cloud,
            conditionCode = it.condition?.code,
            conditionIcon = it.condition?.icon,
            conditionText = it.condition?.text,
            dewpointC = it.dewpointC,
            feelslikeC = it.feelslikeC,
            gustKph = it.gustKph,
            heatindexC = it.heatindexC,
            humidity = it.humidity,
            precipIn = it.precipIn,
            pressureIn = it.pressureIn,
            tempC = it.tempC,
            time = it.time,
            willItRain = it.willItRain,
            windDegree = it.windDegree,
            windDir = it.windDir,
            windKph = it.windKph,
            windMph = it.windMph,
            windchillC = it.windchillC,
        )
    }
