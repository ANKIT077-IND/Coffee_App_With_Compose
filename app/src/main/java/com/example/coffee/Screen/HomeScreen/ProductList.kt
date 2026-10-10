package com.example.coffee.Screen.HomeScreen

import android.R.attr.description
import android.R.attr.name
import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.model.Product
import com.example.coffee.ui.theme.LightBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductList(){
    var list = mutableListOf<Product>()
    list.add(Product(
        id = 1,
        name = "Espresso",
        description = "Espresso",
        price = 20.0,
        image = R.drawable.coffee_1
    ))
    list.add(Product(
        id = 1,
        name = "Espresso",
        description = "Espresso",
        price = 20.0,
        image = R.drawable.coffee_1
    )
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(list) { product ->  ProductItem(product = product)}
    }


}

@Composable
fun ProductItem(product: Product) {
    Card(modifier = Modifier
        .padding(8.dp)
        .clip(RoundedCornerShape(16.dp)), onClick = {}) {
        Box(modifier = Modifier
            .height(150.dp)) {
            Image(
                painter = painterResource(product.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(
                        RoundedCornerShape(26.dp)
                    )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = product.name.toString(), color = Color.Black, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = product.description.toString(),
                color = Color.Black,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1, fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text =product.price .toString(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = LightBrown
                )
                IconButton(onClick = {}, modifier = Modifier.background(color = LightBrown, shape = RoundedCornerShape(8.dp)), colors = IconButtonDefaults.iconButtonColors(containerColor = LightBrown, contentColor = Color.White)) {Icon(imageVector = Icons.Outlined.Add,contentDescription = null) }
            }
        }
    }}

