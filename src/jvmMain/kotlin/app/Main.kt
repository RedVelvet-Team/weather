import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import app.WeatherApp
import app.di.initKoin
import app.di.koin

fun main() = application {
    koin = initKoin()
    val state = rememberWindowState()
    state.size = DpSize(height = 720.dp, width = 1080.dp)
    state.position = WindowPosition(alignment = Alignment.Center)
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        resizable = false,
        undecorated = true,
    ) {
        WeatherApp()
    }
}
