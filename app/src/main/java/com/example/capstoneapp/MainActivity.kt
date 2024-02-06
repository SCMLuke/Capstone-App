package com.example.capstoneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.capstoneapp.ui.theme.CapstoneAppTheme
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapstoneAppTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "homePage") {

                    // The two pages to navigate between. Functions when buttons are pressed.
                    composable("homePage") {
                        homePage(modifier = Modifier, navController)
                    }
                    composable("mapTest") {
                        mapTest(modifier = Modifier, navController)
                    }
                }

                // Silly comments
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    mapTest()
//                }
            }
        }
    }
}

@Composable
fun homePage(modifier: Modifier = Modifier, navController: NavHostController) {
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
fun mapTest(modifier: Modifier = Modifier, navController: NavHostController) {
    val halifax = LatLng(44.6476, -63.5728)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(halifax, 10f)
    }
    // Box to layer the "Return" button on top of the map.
    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            Marker(
                state = MarkerState(position = halifax),
                title = "Halifax",
                snippet = "Marker in Halifax."
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CapstoneAppTheme {
    }
}