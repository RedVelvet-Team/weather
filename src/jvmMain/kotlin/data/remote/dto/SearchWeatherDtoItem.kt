package data.remote.dto



@kotlinx.serialization.Serializable
data class SearchWeatherDto(
    val country: String?,
    val id: Int?,
    val lat: Double?,
    val lon: Double?,
    val name: String?,
    val region: String?,
    val url: String?
)