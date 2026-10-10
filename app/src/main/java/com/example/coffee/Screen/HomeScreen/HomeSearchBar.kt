package com.example.coffee.Screen.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.LightBrown
import com.example.coffee.ui.theme.focusContainerColor
import com.example.coffee.ui.theme.unFocusContainerColor

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeSearchBar() {
    var searchText = remember { mutableStateOf("") }
    Row(
        modifier = Modifier
            .fillMaxWidth(1f), verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = searchText.value,
            onValueChange = { searchText.value = it },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.regular_outline_search),
                    contentDescription = null,
                    tint = Color.White, modifier = Modifier.size(20.dp)
                )
            },
            placeholder = {
                Text(
                    text = "Search Coffee",
                    fontSize = 16.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            },
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 0.dp,
                bottomStart = 16.dp,
                bottomEnd = 0.dp
            ),
            singleLine = true,
            modifier = Modifier.weight(1f).height(56.dp), colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent, focusedContainerColor = focusContainerColor, unfocusedContainerColor = unFocusContainerColor, cursorColor = Color.LightGray, focusedTextColor = Color.White
            )
        )
        Spacer(modifier = Modifier.width(5.dp))
        IconButton(
            onClick = {},
            modifier = Modifier.background(
                color = LightBrown,
                shape = RoundedCornerShape(
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                    topStart = 0.dp,
                    bottomStart = 0.dp
                ),
            ).size(56.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.regular_outline_filter),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}
