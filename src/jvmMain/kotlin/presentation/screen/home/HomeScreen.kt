package presentation.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.di.koinViewModel
import presentation.composable.*

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(state = state, onTextChange = viewModel::search)
}

@Composable
private fun HomeContent(
    state: HomeUiState,
    onTextChange: (String) -> Unit,
) {
    Box(Modifier.fillMaxSize()) {
        ImageBackground(
            painter = painterResource("images/desktop.jpg"),
            contentDescription = "Weather status image"
        )
        BlurBackground(
            modifier = Modifier.align(alignment = Alignment.TopEnd)
        )
        Box(
            modifier = Modifier
                .width(545.dp)
                .fillMaxHeight()
                .align(alignment = Alignment.TopEnd)
                .background(color = Color(0x33454545))
        ) {
            Column(Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(86.dp)
                        .padding(top = 32.dp)
                        .padding(horizontal = 40.dp)
                        .background(Color.Transparent),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                ) {
                    SearchTextField(
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        text = state.search,
                        onTextChange = { onTextChange(it) },
                    )
                }
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 46.dp)
                        .width(1.dp),
                    color = Color(0x999FFFFFF)
                )
                SpacerVertical(24)
                TitleText(
                    modifier = Modifier.padding(top = 64.dp, start = 40.dp)
                        .align(alignment = Alignment.Start),
                    title = "Weather Details",
                )
            }
        }
        Row(
            modifier = Modifier.align(alignment = Alignment.BottomStart).padding(start = 48.dp, bottom = 100.dp),
        ) {
            TextTemp(temp = state.weatherDetailsUiState.tempC)
            SpacerHorizontal(32)
            Column {
                TextCityName(state.weatherDetailsUiState.cityName.toString())
                TextDate(state.weatherDetailsUiState.date.toString())
            }
            SpacerHorizontal(47)
            Column {
                Icon(painterResource("images/desktop.jpg"), contentDescription = null, modifier = Modifier.size(64.dp))
                TextWeatherStatus(state.weatherDetailsUiState.weatherStatus.toString())
            }

        }
    }
}