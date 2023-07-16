package data.remote.dto.forecast


import com.google.gson.annotations.SerializedName

data class ForecastdayDTO(
    val astro: AstroDTO?,
    val date: String?,
    @SerializedName("date_epoch")
    val dateEpoch: Int?,
    val day: DayDTO?,
    val hour: List<HourDTO>?
)