package com.example.coffee.Screen.UI_Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffee.R
import com.example.coffee.ui.theme.LightBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomNavigationView() {
    var navItems = listOf<NavItem>(
        NavItem("Home", R.drawable.regular_outline_home),
        NavItem("Cart", R.drawable.regular_outline_bag),
        NavItem("Favorites", R.drawable.regular_outline_heart),
        NavItem("Profile", R.drawable.outline_account_circle_24)
    )
    NavigationBar {
        navItems.forEach { item ->
            NavigationBarItem(
                onClick = {},
                selected = true, modifier = Modifier.size(35.dp),
                icon = { Image(painter = painterResource(item.icon), contentDescription = null) },
                label = { Text(text = item.title) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.2f)
                )
            )
        }
    }
}

data class NavItem(val title: String, val icon: Int)