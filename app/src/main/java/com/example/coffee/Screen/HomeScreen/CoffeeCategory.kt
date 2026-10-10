package com.example.coffee.Screen.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.ui.theme.LightBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CoffeeCategory() {
    var list = listOf<String>("All", "Macchiato", "Espresso", "Doppio", "Lungo")
    var selectedCategory by remember { mutableStateOf(list.first()) }

    LazyRow(modifier = Modifier.padding(horizontal = 8.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)){
        items(list) {item -> CategoryChip(title = item.toString(), selected = item==selectedCategory, onSelected = {selectedCategory}) }
    }
}

@Composable
fun CategoryChip(title: String, selected: Boolean, onSelected: () -> Unit) {
    Box(
        modifier = Modifier
            .width(width = 90.dp)
            .height(46.dp)
            .clip(RoundedCornerShape(6.dp))
            .clickable(onClick = { onSelected })
            .padding(vertical = 8.dp, horizontal = 4.dp).background(color = if (selected) LightBrown else Color.LightGray , shape = RoundedCornerShape(20)),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = title, fontSize = 14.sp, color = if (selected) Color.White else Color.Black)
    }
}