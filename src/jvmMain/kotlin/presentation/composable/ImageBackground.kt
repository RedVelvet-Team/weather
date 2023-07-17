package presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageBackground(
    modifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String,
    contentScale: ContentScale = ContentScale.FillBounds,
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier.fillMaxSize(),
        contentScale = contentScale,
    )
}