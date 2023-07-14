package app

import domain.entity.ConditionEntity
import domain.entity.WeatherEntity

fun WeatherEntity.toWeatherUIState(): WeatherUIState{

    return WeatherUIState(
        cloud = this.current?.cloud ?: 0,
        humidity = this.current?.humidity ?: 0,
        wind = this.current?.windKph ?: 0.0,
        temp = this.current?.tempC ?:0.0,

    )

}

fun ConditionEntity.toConditionUIStateMapper(): ConditionUIState{
    return ConditionUIState(
        text = this.text ?: "",
        icon = this.icon ?: ""
    )
}