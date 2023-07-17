package presentation.screen.home

data class HomeUiState(
    val error: String? = null,
    val isLoading: Boolean = true,
    val weatherDetailsUiState: WeatherDetailsUiState = WeatherDetailsUiState(),
)

data class WeatherDetailsUiState(
    val tempC: Double? = 0.0,
    val cityName: String? = "",
    val date: String? = "",
    val weatherStatus: String? = "",
    val weatherStatusIcon: String? = "",
    val weatherStatusImage: String? = "",
    val humidity: Int? = 0,
    val cloudy: Int? = 0,
    val windKph: Double? = 0.0,
    val pressure: Double? = 0.0,
)
