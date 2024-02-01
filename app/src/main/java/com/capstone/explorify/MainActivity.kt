package com.capstone.explorify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.capstone.explorify.ui.theme.CapstoneAppTheme
import com.capstone.explorify.views.CountrySelection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            CapstoneAppTheme {
                // Create an instance of the CountrySelection UI from views package, this will run the LandingScreen compose
                val countrySelection = CountrySelection()
                countrySelection.LandingScreen()
            }
        }
    }
}