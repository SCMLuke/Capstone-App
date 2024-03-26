import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.ktx.model.cameraPosition

@Composable
fun MapScreen(
    locationName: String,
    locationDescription: String,
    latitude: Double,
    longitude: Double,
    navController: NavController
) {
    val cameraPositionState = rememberCameraPositionState {
        cameraPosition {
            target(LatLng(latitude, longitude))
            zoom(10f)
        }
    }
    
    Column(modifier = Modifier.fillMaxSize()) {
        GoogleMap (
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            Marker(
                state = MarkerState(position = LatLng(latitude, longitude)),
                title = locationName,
                snippet = locationDescription
            )
        }
        
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
