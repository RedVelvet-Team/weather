package data.remote.dto

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("current")
    val current: Current? = null,
    @SerializedName("location")
    val location: Location? = null
)