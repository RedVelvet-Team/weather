package presentation.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TextWeatherStatus(status: String) {
    Text(
        text = status,
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily(Font("fonts/rubik.ttf", FontWeight(400), FontStyle.Normal)),
            color = Color(0xFFFFFFFF),
            textAlign = TextAlign.Center,
        )
    )
}