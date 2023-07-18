package presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val searchTextStyle = TextStyle(
    fontSize = 24.sp,
    fontFamily = FontFamily(
        Font("fonts/rubik.ttf", FontWeight(400), FontStyle.Normal)
    ),
    color = Color(0x99FFFFFF),
)

@Composable
fun SearchTextField(
    modifier: Modifier = Modifier,
    icon: String = "icons/Magnifer.svg",
    text: String,
    onTextChange: (String) -> Unit,
) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth().background(Color.Transparent),
        value = text,
        onValueChange = onTextChange,
        placeholder = {
            Text(
                text = "Search...",
                style = searchTextStyle,
            )
        },
        leadingIcon = {
            Icon(
                modifier = Modifier.padding(end = 24.dp).size(32.dp),
                painter = painterResource(icon),
                contentDescription = "search icon",
                tint = Color.White,
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.White,
            backgroundColor = Color.Transparent,
            cursorColor = Color.White,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent
        ),
        textStyle = searchTextStyle,
        maxLines = 1,
    )
}