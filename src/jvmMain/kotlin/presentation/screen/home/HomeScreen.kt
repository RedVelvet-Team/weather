package presentation.screen.home

import androidx.compose.foundation.Image
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
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.di.koinViewModel
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

        Image(
            painter = painterResource(
                "desktop.jpg"
            ), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier.fillMaxHeight().width(300.dp).background(Color(0x80C4C4C4))
                .clipToBounds()
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
                        painter = painterResource("Magnifer.svg"),
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
