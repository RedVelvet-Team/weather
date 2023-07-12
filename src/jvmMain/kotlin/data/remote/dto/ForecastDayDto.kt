package data.remote.dto


import com.google.gson.annotations.SerializedName
@kotlinx.serialization.Serializable

data class ForecastDto(
    @SerializedName("forecastday")
    val forecastDay: List<ForecastDayDto>?
)
data class ForecastDayDto(
    val astro: AstroDto?,
    val date: String?,
    @SerializedName("date_epoch")
    val dateEpoch: Int?,
    val day: DayDto?,
    val hour: List<HourDto>?
)

@kotlinx.serialization.Serializable
data class AstroDto(
    @SerializedName("is_moon_up")
    val isMoonUp: Int?,
    @SerializedName("is_sun_up")
    val isSunUp: Int?,
    @SerializedName("moon_illumination")
    val moonIllumination: String?,
    @SerializedName("moon_phase")
    val moonPhase: String?,
    val moonrise: String?,
    val moonset: String?,
    val sunrise: String?,
    val sunset: String?
)

@kotlinx.serialization.Serializable
data class DayDto(
    val avghumidity: Double?,
    @SerializedName("avgtemp_c")
    val avgtempC: Double?,
    @SerializedName("avgtemp_f")
    val avgtempF: Double?,
    @SerializedName("avgvis_km")
    val avgvisKm: Double?,
    @SerializedName("avgvis_miles")
    val avgvisMiles: Double?,
    val condition: ConditionDto?,
    @SerializedName("daily_chance_of_rain")
    val dailyChanceOfRain: Int?,
    @SerializedName("daily_chance_of_snow")
    val dailyChanceOfSnow: Int?,
    @SerializedName("daily_will_it_rain")
    val dailyWillItRain: Int?,
    @SerializedName("daily_will_it_snow")
    val dailyWillItSnow: Int?,
    @SerializedName("maxtemp_c")
    val maxtempC: Double?,
    @SerializedName("maxtemp_f")
    val maxtempF: Double?,
    @SerializedName("maxwind_kph")
    val maxwindKph: Double?,
    @SerializedName("maxwind_mph")
    val maxwindMph: Double?,
    @SerializedName("mintemp_c")
    val mintempC: Double?,
    @SerializedName("mintemp_f")
    val mintempF: Double?,
    @SerializedName("totalprecip_in")
    val totalprecipIn: Double?,
    @SerializedName("totalprecip_mm")
    val totalprecipMm: Double?,
    @SerializedName("totalsnow_cm")
    val totalsnowCm: Double?,
    val uv: Double?
)

@kotlinx.serialization.Serializable
data class HourDto(
    @SerializedName("chance_of_rain")
    val chanceOfRain: Int?,
    @SerializedName("chance_of_snow")
    val chanceOfSnow: Int?,
    val cloud: Int?,
    val condition: ConditionDto?,
    @SerializedName("dewpoint_c")
    val dewpointC: Double?,
    @SerializedName("dewpoint_f")
    val dewpointF: Double?,
    @SerializedName("feelslike_c")
    val feelslikeC: Double?,
    @SerializedName("feelslike_f")
    val feelslikeF: Double?,
    @SerializedName("gust_kph")
    val gustKph: Double?,
    @SerializedName("gust_mph")
    val gustMph: Double?,
    @SerializedName("heatindex_c")
    val heatindexC: Double?,
    @SerializedName("heatindex_f")
    val heatindexF: Double?,
    val humidity: Int?,
    @SerializedName("is_day")
    val isDay: Int?,
    @SerializedName("precip_in")
    val precipIn: Double?,
    @SerializedName("precip_mm")
    val precipMm: Double?,
    @SerializedName("pressure_in")
    val pressureIn: Double?,
    @SerializedName("pressure_mb")
    val pressureMb: Double?,
    @SerializedName("temp_c")
    val tempC: Double?,
    @SerializedName("temp_f")
    val tempF: Double?,
    val time: String?,
    @SerializedName("time_epoch")
    val timeEpoch: Int?,
    val uv: Double?,
    @SerializedName("vis_km")
    val visKm: Double?,
    @SerializedName("vis_miles")
    val visMiles: Double?,
    @SerializedName("will_it_rain")
    val willItRain: Int?,
    @SerializedName("will_it_snow")
    val willItSnow: Int?,
    @SerializedName("wind_degree")
    val windDegree: Int?,
    @SerializedName("wind_dir")
    val windDir: String?,
    @SerializedName("wind_kph")
    val windKph: Double?,
    @SerializedName("wind_mph")
    val windMph: Double?,
    @SerializedName("windchill_c")
    val windchillC: Double?,
    @SerializedName("windchill_f")
    val windchillF: Double?
)
