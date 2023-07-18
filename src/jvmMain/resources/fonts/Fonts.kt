package fonts


import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font

object Fonts {
    val RubikBold = FontFamily(
        Font("fonts/rubik.ttf", FontWeight(500), FontStyle.Normal)
    )

    val RubikSemiBold = FontFamily(
        Font("fonts/rubik.ttf", FontWeight(400), FontStyle.Normal)
    )

    val RubikBlack = FontFamily(
        Font("fonts/rubik.ttf", FontWeight(600), FontStyle.Normal)
    )
}