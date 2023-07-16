package data.remote.dto.forecast


import com.google.gson.annotations.SerializedName
import data.remote.dto.ConditionDTO

data class HourDTO(
    @SerializedName("chance_of_rain")
    val chanceOfRain: Int?,
    @SerializedName("chance_of_snow")
    val chanceOfSnow: Int?,
    val cloud: Int?,
    val condition: ConditionDTO?,
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