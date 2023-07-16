package data.remote.dto.forecast


import com.google.gson.annotations.SerializedName
import data.remote.dto.base.ConditionDTO

data class DayDTO(
    val avghumidity: Double?,
    @SerializedName("avgtemp_c")
    val avgtempC: Double?,
    @SerializedName("avgtemp_f")
    val avgtempF: Double?,
    @SerializedName("avgvis_km")
    val avgvisKm: Double?,
    @SerializedName("avgvis_miles")
    val avgvisMiles: Double?,
    val condition: ConditionDTO?,
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