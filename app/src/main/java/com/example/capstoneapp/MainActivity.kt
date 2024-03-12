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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapstoneAppTheme {
                val navController = rememberNavController()
                // Runs the LandingScreen function from CountrySelection as main entry point to app
                CountrySelection().LandingScreen(navController = navController)
            }
        }
    }
}