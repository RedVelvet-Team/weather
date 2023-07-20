package presentation.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.di.koinViewModel
import presentation.composable.*
import presentation.ui.color.BackgroundColor

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel()
) {
    val state by viewModel.state.collectAsState()
    val query by viewModel.query.collectAsState("")
    val listener = object : HomeListener {
        override fun onTextChanged(text: String) {
            viewModel.setQuery(query = text)
        }
    }
    HomeContent(state = state, listener = listener, query = query)
}

@Composable
private fun HomeContent(
    state: HomeUiState,
    query: String,
    listener: HomeListener,
) {
    if (state.isSuccess)
        Box(Modifier.fillMaxSize()) {
            ImageBackground(
                painter = painterResource(state.weatherDetailsUiState.weatherStatusImage.toString()),
                contentDescription = "Weather status image"
            )
            BlurBackground(
                modifier = Modifier.align(alignment = Alignment.TopEnd),
                image = state.weatherDetailsUiState.weatherStatusImage.toString(),
            )
            Box(
                modifier = Modifier
                    .width(525.dp)
                    .fillMaxHeight()
                    .align(alignment = Alignment.TopEnd)
                    .background(color = BackgroundColor)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(horizontal = 24.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(98.dp)
                            .padding(top = 32.dp)
                            .padding(horizontal = 40.dp)
                            .background(Color.Transparent),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        SearchTextField(
                            modifier = Modifier.align(alignment = Alignment.CenterVertically),
                            text = query,
                            onTextChange = { listener.onTextChanged(it) },
                        )
                    }
                    Line()
                    SpacerVertical(32)
                    Column {
                        TitleText(
                            modifier = Modifier.align(alignment = Alignment.Start).padding(bottom = 48.dp),
                            title = "Weather Details",
                        )
                        WeatherDetails(
                            "Cloudy",
                            state.weatherDetailsUiState.cloudy.toString() + "%",
                            modifier = Modifier.padding(bottom = 48.dp)
                        )
                        WeatherDetails(
                            "Humidity", state.weatherDetailsUiState.humidity.toString() + "%",
                            modifier = Modifier.padding(bottom = 48.dp)
                        )
                        WeatherDetails(
                            "Wind", state.weatherDetailsUiState.windKph.toString() + "km/h",
                            modifier = Modifier.padding(bottom = 48.dp)
                        )
                        WeatherDetails("Pressure", state.weatherDetailsUiState.pressure.toString() + "%")
                    }
                    Line()
                }
            }
            Row(
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .padding(start = 48.dp, bottom = 100.dp),
            ) {
                TextTemp(temp = state.weatherDetailsUiState.tempC)
                SpacerHorizontal(32)
                Column {
                    TitleText(
                        title = state.weatherDetailsUiState.cityName.toString(),
                        fontSize = 64,
                    )
                    TitleText(
                        title = state.weatherDetailsUiState.date.toString(),
                        fontSize = 20,
                    )
                }
                SpacerHorizontal(47)
                Column() {
                    Icon(
                        painterResource("icons/116.png"),
                        contentDescription = null,
                        modifier = Modifier.size(64.dp),
                        tint = Color.White
                    )
                    BodyText(
                        title = state.weatherDetailsUiState.weatherStatus.toString()
                    )
                }
            }

        }
    else
        Image(
            painterResource("images/cloud_day.jpg"),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

}