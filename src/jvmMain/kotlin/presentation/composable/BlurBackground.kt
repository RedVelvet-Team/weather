package presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
    radius: Int = 16,
    image: String = "",
) {
    Box(
        modifier = modifier
            .blur(radius = radius.dp)
            .width(545.dp)
            .fillMaxHeight()
            .background(Color.Transparent)
    ) {
        Image(
            painter = painterResource(resourcePath = "images/desktop.jpg"),
            contentDescription = "image description",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
        )
    }
}