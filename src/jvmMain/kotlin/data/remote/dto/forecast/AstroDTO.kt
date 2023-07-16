package data.remote.dto.forecast


import com.google.gson.annotations.SerializedName

data class AstroDTO(
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