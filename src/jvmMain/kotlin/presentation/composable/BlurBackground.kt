package presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BlurBackground(
    modifier: Modifier = Modifier,
    color: Color = Color(0x20454545)
) {
    Box(
        modifier = modifier
            .blur(radius = 50.dp)
            .width(545.dp)
            .height(1024.dp)
    ) {
        Image(
            painter = painterResource(resourcePath = "images/cloud_day.jpg"),
            contentDescription = "image description",
            contentScale = ContentScale.Crop
        )
    }
}