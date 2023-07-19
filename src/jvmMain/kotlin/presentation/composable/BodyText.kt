package presentation.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import presentation.ui.color.White60
import presentation.ui.font.RubikMedium

@Composable
fun BodyText(
    modifier: Modifier = Modifier,
    title: String,
    color: Color = White60,
    fontWeight: FontWeight = FontWeight(500),
    fontSize: Int = 18,
) {
    Text(
        modifier = modifier,
        text = title,
        style = TextStyle(
            fontSize = fontSize.sp,
            fontFamily = RubikMedium,
            fontStyle = FontStyle.Normal,
            fontWeight = fontWeight,
            color = color,
        ),
    )
}