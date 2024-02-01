package com.capstone.explorify

import android.os.Bundle
import android.view.Window
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.capstone.explorify.ui.theme.CapstoneAppTheme
import com.capstone.explorify.views.CountrySelection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE) // This line eliminates "Explorify" from showing under status bar
        //installSplashScreen() <-- Not needed for just showing an app icon as splash
        setContent {
            CapstoneAppTheme {
                // Create an instance of the CountrySelection UI from views package, this will run the LandingScreen compose
                val countrySelection = CountrySelection()
                countrySelection.LandingScreen()
            }
        }
    }
}