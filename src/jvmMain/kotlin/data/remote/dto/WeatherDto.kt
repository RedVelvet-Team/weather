package data.remote.dto

import com.google.gson.annotations.SerializedName


@kotlinx.serialization.Serializable
data class WeatherDto(
    val current: CurrentDto?,
    val location: LocationDto?
)

@kotlinx.serialization.Serializable
data class ConditionDto(
    val code: Int?,
    val icon: String?,
    val text: String?
)

@kotlinx.serialization.Serializable
data class LocationDto(
    val country: String?,
    val lat: Double?,
    val localtime: String?,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int?,
    val lon: Double?,
    val name: String?,
    val region: String?,
    @SerializedName("tz_id")
    val tzId: String?
)