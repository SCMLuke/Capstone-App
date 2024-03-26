package com.example.capstoneapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.ktx.model.cameraPosition

class MapScreen {
    companion object {
        @Composable
        fun Content(navController: NavController) {
            val cameraPositionState = rememberCameraPositionState {
                cameraPosition {
                    target(LatLng(DEFAULT_LATITUDE, DEFAULT_LONGITUDE))
                    zoom(10f)
                }
            }

            Column(modifier = Modifier.fillMaxSize()) {
                GoogleMap(
                    modifier = Modifier.fillMaxSize(),
                    cameraPositionState = cameraPositionState
                )

                Button(
                    onClick = { navController.navigateUp() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(text = "Return")
                }
            }
        }

        // Dummy co-ordinates for now
        private const val DEFAULT_LATITUDE = 0.0
        private const val DEFAULT_LONGITUDE = 0.0
    }
}
