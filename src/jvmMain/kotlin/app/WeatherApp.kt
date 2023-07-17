package app

import androidx.compose.runtime.Composable
import app.di.koinViewModel
import presentation.screen.home.HomeViewModel

@Composable
fun WeatherApp() {
    val homeViewModel : HomeViewModel= koinViewModel()

}