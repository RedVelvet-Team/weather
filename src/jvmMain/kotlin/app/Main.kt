import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import app.WeatherApp
import app.di.initKoin
import app.di.koin

fun main() = application {
    koin = initKoin()
    val state = rememberWindowState()
    initWindow(state)
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        resizable = false,
        undecorated = true,
    ) {
        WeatherApp()
    }
}

private fun initWindow(state: WindowState) {
    state.size = DpSize(height = 970.dp, width = 1440.dp)
    state.position = WindowPosition(alignment = Alignment.Center)
}
