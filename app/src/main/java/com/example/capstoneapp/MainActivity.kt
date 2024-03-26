package com.example.capstoneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.capstoneapp.ui.theme.CapstoneAppTheme
import com.example.capstoneapp.views.CountrySelection
import com.example.capstoneapp.views.MapScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapstoneAppTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "landing_screen") {
                    // Landing Screen
                    composable("landing_screen") {
                        CountrySelection().LandingScreen(navController = navController)
                    }

                    // Map Screen
                    composable("map_screen") {
                        MapScreen.Content(navController = navController)
                    }
                }
            }
        }
    }
}
