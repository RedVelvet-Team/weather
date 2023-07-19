package presentation.composable

import androidx.compose.runtime.Composable

@Composable
fun TextTemp(temp: Double?) {
//    Text(
//        text = "$temp°",
//        style = TextStyle(
//            fontSize = 100.sp,
//            fontFamily = FontFamily(Font("fonts/rubik.ttf", FontWeight(500), FontStyle.Normal)),
//            color = Color(0xFFFFFFFF),
//            textAlign = TextAlign.Center,
//        ),
//    )
    TitleText(
        title = "$temp°",
        fontSize = 100
    )
}