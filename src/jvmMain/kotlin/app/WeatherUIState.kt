package app

import javax.swing.Icon

data class WeatherUIState(
    val search: String = "",
    val cloud: Int = 0,
    val humidity: Int = 0,
    val wind: Double = 0.0,
    val chanceOfRain: Int = 0,
    val weeklyForeCase: WeeklyForeCaseUIState = WeeklyForeCaseUIState(),
    val temp: Double = 0.0,
    val condition: ConditionUIState = ConditionUIState(),
    val location: LocationUIState = LocationUIState()
)

data class WeeklyForeCaseUIState(
    val foreCaseDay: List<ForeCaseDayUIState> = emptyList()
)

data class ForeCaseDayUIState(
    val date: String = "",
    val maxTemp: Double = 0.0,
    val minTemp: Double = 0.0,
    val icon: String = ""
)

data class ConditionUIState(
    val text: String = "",
    val icon: String = ""
)

data class LocationUIState(
    val name: String = "",
    val localTime: String = ""
)