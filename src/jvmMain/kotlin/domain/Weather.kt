package domain

data class Weather(
    val location: Location,
    val condition: Condition,
    val current: Current
    ) {

    data class Location(
        val name: String,
        val region: String,
        val country: String,
        val lat: Double,
        val lon: Double,
        val localtime: String
    )
    data class Condition(
        val text: String,
        val icon: String,
        val code: Int
    )

    data class Current(
        val lastUpdated: String,
        val tempC: Double,
        val tempF: Double,
        val isDay: Int,
        val windMph: Double,
        val windKph: Double,
        val windDegree: Int,
        val windDir: String,
        val pressureMb: Double,
        val pressureIn: Double,
        val humidity: Int,
        val cloud: Int,
        val feelslikeC: Double,
        val feelslikeF: Double,
        val uv: Double,
    )
}