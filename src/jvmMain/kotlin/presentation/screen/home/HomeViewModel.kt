@file:OptIn(FlowPreview::class)

package presentation.screen.home

import domain.entity.weather.WeatherEntity
import domain.usecase.GetCurrentLocationUseCase
import domain.usecase.GetForecastByNameUseCase
import domain.usecase.GetWeatherByLocationUseCase
import domain.usecase.GetWeatherByNameUseCase
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeViewModel : KoinComponent {
    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    private val _query = MutableStateFlow("")
    val query = _query.asStateFlow()

    private val getWeatherByNameUseCase: GetWeatherByNameUseCase by inject()
    private val getWeatherByLocationUseCase: GetWeatherByLocationUseCase by inject()
    private val getForecastByNameUseCase: GetForecastByNameUseCase by inject()
    private val getForecastByLocationUseCase: GetWeatherByLocationUseCase by inject()
    private val getCurrentLocationUseCase: GetCurrentLocationUseCase by inject()
    private val viewModelScope = CoroutineScope(Dispatchers.IO)

    init {
        getWeatherByLocation()
        getForecastByLocation()
        search()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun search() {
        viewModelScope.launch {
            query.debounce(1000).flatMapLatest { cityName ->
                if (cityName.isBlank())
                    flowOf(null)
                else
                    try {
                        flow<WeatherEntity> {
                            try {
                                val weatherData = getWeatherByNameUseCase(cityName)
                                emit(weatherData)
                            } catch (e: Exception) {
                            }

                        }
                    } catch (e: Exception) {
                        flowOf(null)
                    }
            }.collectLatest { weather ->
                _state.update {
                    it.copy(
                        isSuccess = true,
                        weatherDetailsUiState = WeatherDetailsUiState(
                            tempC = weather?.tempC ?: 0.0,
                            cloudy = weather?.cloud ?: 0,
                            cityName = weather?.name ?: "",
                            windKph = weather?.windKph ?: 0.0,
                            weatherStatus = weather?.conditionText ?: "",
                            weatherStatusIcon = weather?.conditionIcon ?: "",
                            weatherStatusImage = "images/rainy_night.jpg",
                            humidity = weather?.humidity ?: 0,
                            pressure = weather?.pressureIn ?: 0.0,
                            date = weather?.localtime ?: "",
                        ),
                    )
                }
            }
        }
    }

    private fun getWeatherByLocation() {
        viewModelScope.launch {
            val weather = getWeatherByLocationUseCase(getCurrentLocationUseCase())
            _state.update {
                it.copy(
                    isSuccess = true,
                    weatherDetailsUiState = WeatherDetailsUiState(
                        tempC = weather.tempC,
                        cloudy = weather.cloud,
                        cityName = weather.name,
                        windKph = weather.windKph,
                        weatherStatus = weather.conditionText,
                        weatherStatusIcon = weather.conditionIcon,
                        weatherStatusImage = "images/rainy_night.jpg",
                        humidity = weather.humidity,
                        pressure = weather.pressureIn,
                        date = weather.localtime,
                    ),
                )
            }
        }
    }


    fun setQuery(query: String) {
        _query.value = query
    }


    private fun getForecastByLocation() {
        viewModelScope.launch {
            getForecastByLocationUseCase(getCurrentLocationUseCase())
        }
    }


    fun getWeatherByName(city: String) {
        viewModelScope.launch {
            getWeatherByNameUseCase(city)
        }
    }


    fun getForecastByName(city: String, days: Int) {
        viewModelScope.launch {
            getForecastByNameUseCase(city, days)
        }
    }
}