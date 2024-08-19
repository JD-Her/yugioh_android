package com.example.yugioh.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.yugioh.R
import androidx.compose.material.Card

@Composable
fun ListPage() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CardElemento(name = "Amo de las Mentes", picture = R.drawable.amo)
        Spacer(modifier = Modifier.height(8.dp))
        CardElemento(name = "Colorless", picture = R.drawable.colorles)
        Spacer(modifier = Modifier.height(8.dp))
        CardElemento(name = "Kunai", picture = R.drawable.kunai)
        Spacer(modifier = Modifier.height(8.dp))
        CardElemento(name = "Mago", picture = R.drawable.mago)
        Spacer(modifier = Modifier.height(8.dp))
        CardElemento(name = "Payaso", picture = R.drawable.payaso)
//        MyGoogleMaps()

    }
}
@Composable
fun CardElemento(name: String, picture: Int) {
   Card(modifier = Modifier, elevation = 8.dp) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = name)
            Image(
                painter = painterResource(id = picture),
                contentDescription = "picture",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .size(130.dp)

            )
        }
    }
}
