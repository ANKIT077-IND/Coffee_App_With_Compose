package com.example.coffee.Screen.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.Screen.UI_Component.BottomNavigationView

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomNavigationView() },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(brush = Brush.linearGradient(colors = listOf(Color(0xFF303030),Color(0xFF1F1F1F),Color(0xFF121212))))
        )
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize().padding(16.dp)) {
            Text(text = "Location", fontSize = 14.sp, color = Color.LightGray)
            Spacer(Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Noida sector 50,noida utter pradesh", fontSize = 16.sp, color = Color.LightGray)
                Icon(imageVector = Icons.Default.KeyboardArrowDown,contentDescription = null, tint = Color.White)

            }
            Spacer(Modifier.height(10.dp))
            HomeSearchBar()
            Spacer(Modifier.height(30.dp))
            Image(painter = painterResource(R.drawable.banner_1),contentDescription = null)
            Spacer(Modifier.height(20.dp))
            CoffeeCategory()
            Spacer(Modifier.height(20.dp))
            ProductList()
            Spacer(Modifier.height(20.dp))
        }

    }
}