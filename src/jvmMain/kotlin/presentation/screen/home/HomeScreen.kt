package presentation.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.di.koinViewModel
import presentation.composable.BlurBackground
import presentation.composable.ImageBackground
import presentation.composable.TitleText

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(state = state)
}

@Composable
private fun HomeContent(state: HomeUiState) {
    Box(Modifier.fillMaxSize()) {
        ImageBackground(
            painter = painterResource("images/cloud_day.jpg"),
            contentDescription = "Weather status image"
        )
        BlurBackground(
            modifier = Modifier.align(alignment = Alignment.TopEnd)
        )
        Box(
            modifier = Modifier
                .width(545.dp)
                .height(1024.dp)
                .align(alignment = Alignment.TopEnd)
                .background(color = Color(0x33454545))
        ) {
            Column(Modifier.fillMaxSize().padding(horizontal = 40.dp)) {
                Row(
                    Modifier.fillMaxWidth().padding(top = 40.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {

                    Text(text = "Search", fontSize = 14.sp, color = Color.White, textAlign = TextAlign.Center)
                    Spacer(Modifier.width(16.dp))
                    Icon(
                        painter = painterResource("icons/Magnifer.svg"),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }
                Divider(
                    modifier = Modifier
                        .fillMaxWidth().padding(top = 24.dp)
                        .width(1.dp),
                    color = Color(0x999FFFFFF)
                )

                Spacer(Modifier.height(24.dp))
                TitleText("Weather Details")

            }
        }
    }
}
