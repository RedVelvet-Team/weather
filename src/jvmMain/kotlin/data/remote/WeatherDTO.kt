package data.remote


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherDTO(
    @SerialName("query")
    val query: Query
) {
    @Serializable
    data class Query(
        @SerialName("custom_id")
        val customId: String,
        @SerialName("q")
        val q: String,
        @SerialName("location")
        val location: Location,
        @SerialName("current")
        val current: Current
    ) {
        @Serializable
        data class Location(
            @SerialName("name")
            val name: String,
            @SerialName("region")
            val region: String,
            @SerialName("country")
            val country: String,
            @SerialName("lat")
            val lat: Double,
            @SerialName("lon")
            val lon: Double,
            @SerialName("tz_id")
            val tzId: String,
            @SerialName("localtime_epoch")
            val localtimeEpoch: Int,
            @SerialName("localtime")
            val localtime: String
        )

        @Serializable
        data class Current(
            @SerialName("last_updated_epoch")
            val lastUpdatedEpoch: Int,
            @SerialName("last_updated")
            val lastUpdated: String,
            @SerialName("temp_c")
            val tempC: Double,
            @SerialName("temp_f")
            val tempF: Double,
            @SerialName("is_day")
            val isDay: Int,
            @SerialName("condition")
            val condition: Condition,
            @SerialName("wind_mph")
            val windMph: Double,
            @SerialName("wind_kph")
            val windKph: Double,
            @SerialName("wind_degree")
            val windDegree: Int,
            @SerialName("wind_dir")
            val windDir: String,
            @SerialName("pressure_mb")
            val pressureMb: Double,
            @SerialName("pressure_in")
            val pressureIn: Double,
            @SerialName("precip_mm")
            val precipMm: Double,
            @SerialName("precip_in")
            val precipIn: Double,
            @SerialName("humidity")
            val humidity: Int,
            @SerialName("cloud")
            val cloud: Int,
            @SerialName("feelslike_c")
            val feelslikeC: Double,
            @SerialName("feelslike_f")
            val feelslikeF: Double,
            @SerialName("vis_km")
            val visKm: Double,
            @SerialName("vis_miles")
            val visMiles: Double,
            @SerialName("uv")
            val uv: Double,
            @SerialName("gust_mph")
            val gustMph: Double,
            @SerialName("gust_kph")
            val gustKph: Double
        ) {
            @Serializable
            data class Condition(
                @SerialName("text")
                val text: String,
                @SerialName("icon")
                val icon: String,
                @SerialName("code")
                val code: Int
            )
        }
    }
}