import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import app.WeatherApp
import app.di.initKoin
import app.di.koin

fun main() = application {
    koin = initKoin()
    Window(onCloseRequest = ::exitApplication) {
        WeatherApp()
    }
}
