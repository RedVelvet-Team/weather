package presentation.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import presentation.ui.color.White87
import presentation.ui.font.RubikSemiBold

@Composable
fun TitleText(
    modifier: Modifier = Modifier,
    title: String,
    color: Color = White87,
    fontWeight: FontWeight = FontWeight(600),
    fontSize: Int = 22,
) {
    Text(
        modifier = modifier,
        text = title,
        style = TextStyle(
            fontSize = fontSize.sp,
            fontFamily = RubikSemiBold,
            fontStyle = FontStyle.Normal,
            fontWeight = fontWeight,
            color = color,
        ),
    )
}