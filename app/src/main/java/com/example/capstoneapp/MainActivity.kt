package com.example.capstoneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.capstoneapp.ui.theme.CapstoneAppTheme
import com.example.capstoneapp.views.CountrySelection
import com.example.capstoneapp.views.MapView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapstoneAppTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "homePage") {

                    // The two pages to navigate between. Functions when buttons are pressed.
                    composable("homePage") {
                        MapView().homePage(modifier = Modifier, navController)
                    }
                    composable("mapTest") {
                        MapView().mapTest(modifier = Modifier, navController)
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CapstoneAppTheme {
    }
}