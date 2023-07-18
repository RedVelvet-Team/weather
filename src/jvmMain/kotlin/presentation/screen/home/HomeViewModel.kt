@file:OptIn(FlowPreview::class)

package presentation.screen.home

import domain.usecase.GetCurrentLocationUseCase
import domain.usecase.GetForecastByNameUseCase
import domain.usecase.GetWeatherByLocationUseCase
import domain.usecase.GetWeatherByNameUseCase
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import presentation.base.BaseViewModel

class HomeViewModel : BaseViewModel(), KoinComponent {
    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    private val getWeatherByNameUseCase: GetWeatherByNameUseCase by inject()
    private val getWeatherByLocationUseCase: GetWeatherByLocationUseCase by inject()
    private val getForecastByNameUseCase: GetForecastByNameUseCase by inject()
    private val getForecastByLocationUseCase: GetWeatherByLocationUseCase by inject()
    private val getCurrentLocationUseCase: GetCurrentLocationUseCase by inject()

    init {
        getWeatherByLocation()
        getForecastByLocation()
    }

    private fun getWeatherByLocation() {
        viewModelScope.launch {
            val weather = getWeatherByLocationUseCase(getCurrentLocationUseCase())
            println(weather)
            _state.update {
                it.copy(
                    isLoading = false,
                    weatherDetailsUiState = WeatherDetailsUiState(
                        tempC = weather.tempC,
                        cloudy = weather.cloud,
                        cityName = weather.name,
                        windKph = weather.windKph,
                        weatherStatus = weather.conditionText,
                        weatherStatusIcon = weather.conditionIcon,
                        weatherStatusImage = "",
                        humidity = weather.humidity,
                        pressure = weather.pressureIn,
                        date = weather.localtime,
                    ),
                )
            }
        }
    }


    fun search(title: String) {
        _state.update {
            it.copy(
                isLoading = false,
                search = title
            )
        }
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