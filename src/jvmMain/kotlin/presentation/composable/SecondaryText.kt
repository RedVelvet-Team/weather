package presentation.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import presentation.ui.color.White38
import presentation.ui.font.RubikRegular

@Composable
fun SecondaryText(
    modifier: Modifier = Modifier,
    title: String,
    color: Color = White38,
    fontWeight: FontWeight = FontWeight(400),
    fontSize: Int = 16,
) {
    Text(
        modifier = modifier,
        text = title,
        style = TextStyle(
            fontSize = fontSize.sp,
            fontFamily = RubikRegular,
            fontStyle = FontStyle.Normal,
            fontWeight = fontWeight,
            color = color,
        ),
    )
}