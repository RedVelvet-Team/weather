package domain.entity


data class ForecastEntity(
    val forecastDay: List<ForecastDayEntity>?
)
data class ForecastDayEntity(
    val astro: AstroEntity?,
    val date: String?,
    val dateEpoch: Int?,
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
    val avgtempF: Double?,
    val avgvisKm: Double?,
    val avgvisMiles: Double?,
    val condition: ConditionEntity?,
    val dailyChanceOfRain: Int?,
    val dailyChanceOfSnow: Int?,
    val dailyWillItRain: Int?,
    val dailyWillItSnow: Int?,
    val maxtempC: Double?,
    val maxtempF: Double?,
    val maxwindKph: Double?,
    val maxwindMph: Double?,
    val mintempC: Double?,
    val mintempF: Double?,
    val totalprecipIn: Double?,
    val totalprecipMm: Double?,
    val totalsnowCm: Double?,
)

data class HourEntity(
    val chanceOfRain: Int?,
    val chanceOfSnow: Int?,
    val cloud: Int?,
    val condition: ForecastEntity?,
    val dewpointC: Double?,
    val dewpointF: Double?,
    val feelslikeC: Double?,
    val feelslikeF: Double?,
    val gustKph: Double?,
    val gustMph: Double?,
    val heatindexC: Double?,
    val heatindexF: Double?,
    val humidity: Int?,
    val isDay: Int?,
    val precipIn: Double?,
    val precipMm: Double?,
    val pressureIn: Double?,
    val pressureMb: Double?,
    val tempC: Double?,
    val tempF: Double?,
    val time: String?,
    val timeEpoch: Int?,
    val willItRain: Int?,
    val willItSnow: Int?,
    val windDegree: Int?,
    val windDir: String?,
    val windKph: Double?,
    val windMph: Double?,
    val windchillC: Double?,
    val windchillF: Double?
)
