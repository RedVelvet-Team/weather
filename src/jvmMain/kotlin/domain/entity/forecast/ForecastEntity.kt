package domain.entity.forecast


data class ForecastEntity(
    val forecastDay: List<ForecastDayEntity>?
)

data class ForecastDayEntity(
    val astro: AstroEntity?,
    val date: String?,
    val day: DayEntity?,
    val hour: List<HourEntity>?
)

data class AstroEntity(
    val moonPhase: String?,
    val moonrise: String?,
    val moonset: String?,
    val sunrise: String?,
    val sunset: String?
)

data class DayEntity(
    val avghumidity: Double?,
    val avgtempC: Double?,
    val conditionCode: Int?,
    val conditionIcon: String?,
    val conditionText: String?,
    val dailyChanceOfRain: Int?,
    val dailyWillItRain: Int?,
    val maxtempC: Double?,
    val maxwindKph: Double?,
    val mintempC: Double?,
    val totalprecipIn: Double?,
)

data class HourEntity(
    val chanceOfRain: Int?,
    val cloud: Int?,
    val conditionCode: Int?,
    val conditionIcon: String?,
    val conditionText: String?,
    val dewpointC: Double?,
    val feelslikeC: Double?,
    val gustKph: Double?,
    val heatindexC: Double?,
    val humidity: Int?,
    val precipIn: Double?,
    val pressureIn: Double?,
    val tempC: Double?,
    val time: String?,
    val willItRain: Int?,
    val windDegree: Int?,
    val windDir: String?,
    val windKph: Double?,
    val windMph: Double?,
    val windchillC: Double?,
)
