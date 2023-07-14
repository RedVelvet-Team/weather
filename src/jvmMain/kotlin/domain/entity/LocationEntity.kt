package domain.entity

data class LocationEntity(
    val country: String?,
    val localtime: String?,
    val localtimeEpoch: Int?,
    val name: String?,
    val region: String?,
    val tzId: String?
)
