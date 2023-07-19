package presentation.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import presentation.ui.color.White87

@Composable
fun Line(
    modifier: Modifier = Modifier,
    paddingTop: Int = 46,
    color: Color = White87
) {
    Divider(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = paddingTop.dp)
            .width(1.dp),
        color = color
    )
}