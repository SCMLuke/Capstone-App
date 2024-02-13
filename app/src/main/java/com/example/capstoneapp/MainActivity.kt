package com.example.capstoneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.capstoneapp.ui.theme.CapstoneAppTheme
import com.example.capstoneapp.views.CountrySelection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapstoneAppTheme {
                // Runs the LandingScreen function from CountrySelection as main entry point to app
                CountrySelection().LandingScreen()
            }
        }
    }
}