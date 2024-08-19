package com.example.yugioh.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun ShowingMap() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Text(text = "Map", fontSize = 30.sp)
            MyGoogleMaps()
        }
    }
}

@Composable
fun MyGoogleMaps() {
    val newYork = LatLng(28.270833, -16.63916)
//    val cameraPosition = CameraPosition.fromLatLngZoom(newYork, 10f)
//    val cameraState = rememberCameraPositionState() {
//        position = cameraPosition
//    }
    Box(modifier = Modifier
        .padding(bottom = 80.dp)
        .fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Text(text = "Map", fontSize = 30.sp)
            //"AIzaSyCuGMaBbELjW52__4fCkx0S3ZBUBBYDbuE
        }

        GoogleMap(
            modifier = Modifier.fillMaxSize()){
            Marker(position = LatLng(27.270833, -17.63916))
            Marker(position = LatLng(27.270933, -17.63350))
        }
    }
}