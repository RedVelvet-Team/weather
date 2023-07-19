package presentation.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp

@Composable
fun WeatherDetails(
    weatherStatus: String,
    degree: String,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextStatus(weatherStatus)
        TextStatus(degree)
    }
}

@Composable
fun TextStatus(status: String) {
    Text(
        text = status,
        style = TextStyle(
            fontSize = 22.sp,
            fontFamily = FontFamily(Font("fonts/rubik.ttf", FontWeight(400), FontStyle.Normal)),
            color = Color(0xFFFFFFFF),
        )
    )
}