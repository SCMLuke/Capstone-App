package com.example.capstoneapp.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.capstoneapp.model.Country
import com.example.capstoneapp.model.CreatedCountries.Mexico
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

class CountrySelection {
    @Composable
    fun LandingScreen(modifier: Modifier = Modifier) {
        val countries = listOf("America", "Argentina", "Bhutan", "Canada", "France", "Greece", "Iran", "Mexico", "Netherlands", "Sweden")

        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color(0xff273537))
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(height = 90.dp)
                        .background(color = Color(0xff254954))
                ) {
                    Text(
                        text = "Country Selection",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Bold,
                            shadow = Shadow(
                                color = Color.Black.copy(alpha = 0.25f),
                                offset = Offset(0f, 4f),
                                blurRadius = 4f
                            )
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(height = 90.dp)
                            .border(border = BorderStroke(1.dp, Color(0xff282828)))
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
            }

            items(countries.size) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(85.dp)
                        .padding(vertical = 8.dp, horizontal = 20.dp)
                        .clip(shape = RoundedCornerShape(25.dp))
                        .background(color = Color(0xff8db2b2))
                ) {
                    Text(
                        text = countries[index],
                        color = Color(0xff0f0f0f),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Light
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
            }
        }
    }



    @Composable
    public fun homePage(modifier: Modifier = Modifier, navController: NavHostController) {
        Column(modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { navController.navigate("mapTest") },
                modifier.padding(0.dp,0.dp,0.dp,48.dp),) {
                Text(text = "View Map",
                    fontSize = 24.sp)
            }
        }
    }
    @Composable
    public fun mapTest(modifier: Modifier = Modifier, navController: NavHostController) {
        val mexicoHistorical = LatLng(Mexico.mexico.historicalSites[0].latitude, Mexico.mexico.historicalSites[0].longitude)
        val cameraPositionState = rememberCameraPositionState {
            position = CameraPosition.fromLatLngZoom(mexicoHistorical, 10f)
        }
        // Box to layer the "Return" button on top of the map.
        Box(modifier = Modifier.fillMaxSize()) {
            GoogleMap(
                modifier = Modifier.fillMaxSize(),
                cameraPositionState = cameraPositionState
            ) {
                Marker(
                    state = MarkerState(position = mexicoHistorical),
                    title = Mexico.mexico.countryName,
                    snippet = Mexico.mexico.countryDescription
                )
            }
            Column(modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = { navController.navigate("homePage") },
                    modifier.padding(0.dp,0.dp,0.dp,48.dp),) {
                    Text(text = "Return",
                        fontSize = 24.sp)
                }
            }
        }
    }

    @Composable
    private fun LandingScreenPreview() {
        CountrySelection().LandingScreen()
    }
}