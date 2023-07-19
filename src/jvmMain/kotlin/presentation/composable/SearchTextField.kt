package presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import presentation.ui.color.White87
import presentation.ui.font.RubikSemiBold

@Composable
fun SearchTextField(
    text: String,
    placeHolder: String = "Search...",
    onTextChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    icon: String = "icons/Magnifer.svg",
) {
    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent),
        value = text,
        onValueChange = onTextChange,
        placeholder = {
            SecondaryText(
                title = placeHolder,
                fontSize = 22
            )
        },
        leadingIcon = {
            Icon(
                modifier = Modifier
                    .padding(end = 24.dp)
                    .size(32.dp),
                painter = painterResource(icon),
                contentDescription = "search icon",
                tint = Color.White,
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = White87,
            backgroundColor = Color.Transparent,
            cursorColor = White87,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent
        ),
        textStyle = TextStyle(
            fontFamily = RubikSemiBold,
            fontSize = 32.sp,
        ),
        maxLines = 1,
    )
}