package data.remote.dto.search

import com.google.gson.annotations.SerializedName


data class SearchDto(
    @SerializedName("country")
    val country: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lon")
    val lon: Double?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("region")
    val region: String?,
    @SerializedName("url")
    val url: String?
)