import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.capstoneapp.views.CountrySelection

@Composable
fun MainNavGraph() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "home") {
        composable("home") {
            CountrySelection().LandingScreen(navController = navController)
        }
        composable("map/{country}") { backStackEntry ->
            val country = backStackEntry.arguments?.getString("country") ?: ""
            val locationName = "Location Name"
            val locationDescription = "Location Description"
            val latitude = 0.0
            val longitude = 0.0
            MapScreen(
                locationName = locationName,
                locationDescription = locationDescription,
                latitude = latitude,
                longitude = longitude,
                navController = navController
            )
        }
    }
}
