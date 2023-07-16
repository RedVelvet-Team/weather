package app

import domain.entity.*

fun WeatherEntity.toWeatherUIState(): WeatherUIState{
    return WeatherUIState(
        cloud = this.current?.cloud ?: 0,
        humidity = this.current?.humidity ?: 0,
        wind = this.current?.windKph ?: 0.0,
        temp = this.current?.tempC ?:0.0,
        condition = this.current?.condition?.toConditionUIStateMapper() ?: ConditionUIState(),
        location = this.location?.toLocationUIStateMapper() ?: LocationUIState(),
        weeklyForeCase = this.forecast?.toWeeklyForeCaseUIStateMapper() ?: WeeklyForeCaseUIState()
    )
}

fun ConditionEntity.toConditionUIStateMapper(): ConditionUIState{
    return ConditionUIState(
        text = this.text ?: "",
        icon = this.icon ?: ""
    )
}

fun LocationEntity.toLocationUIStateMapper(): LocationUIState{
    return LocationUIState(
        name = this.name ?: "",
        localTime = this.localtime ?: ""
    )
}

fun ForecastEntity.toWeeklyForeCaseUIStateMapper(): WeeklyForeCaseUIState{
    return WeeklyForeCaseUIState(
        foreCaseDay = this.forecastDay?.map { it.toForeCaseDayUIState() }.orEmpty()
    )
}

fun ForecastDayEntity.toForeCaseDayUIState(): ForeCaseDayUIState{
    return ForeCaseDayUIState(
        date = this.date ?: "",
        maxTemp = this.day?.maxtempC ?: 0.0,
        minTemp = this.day?.mintempC ?: 0.0,
        icon = this.day?.condition?.icon ?: ""
    )
}