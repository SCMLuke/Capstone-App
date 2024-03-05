package com.example.capstoneapp.views

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
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
    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun LandingScreen(modifier: Modifier = Modifier) {
        val countries = listOf(
            "America",
            "Argentina",
            "Australia",
            "Bhutan",
            "Brazil",
            "Canada",
            "China",
            "France",
            "Germany",
            "Greece",
            "India",
            "Iran",
            "Italy",
            "Japan",
            "Mexico",
            "Netherlands",
            "Russia",
            "Sweden"
        )

        LazyColumn(
            modifier = Modifier.background(Color(0xff727272)) // Screen BG color
        ) {
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xff254954)) // Sticky header BG color
                ) {
                    Text(
                        text = "Country Selection",
                        color = Color.White,
                        textAlign = TextAlign.Start,
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        modifier = Modifier.padding(22.dp)
                    )
                }
            }

            items(countries.size) { index ->
                ExpandableCard(
                    country = countries[index]
                )
            }
        }
    }

    // Compose code for the expandable card function
    @Composable
    fun ExpandableCard(country: String, modifier: Modifier = Modifier) {
        var expanded by remember { mutableStateOf(false) }
        val arrowIcon: ImageVector = if (expanded) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowRight

        ElevatedCard(
            shape = MaterialTheme.shapes.medium,
            //elevation = 8.dp, Don't know why this won't work: need to fix
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp, horizontal = 7.dp)
                .clickable { expanded = !expanded }
            ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = country,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Light
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = arrowIcon,
                        contentDescription = "Card Expansion Arrow",
                        modifier = Modifier.size(24.dp)
                    )
                }

                // TODO: Map onClick events to sections within the map
                if (expanded) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Column {
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                    append("Historical Locations\n")
                                }
                            },
                            onClick = {  }
                        )
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                    append("Cultural Centers\n")
                                }
                            },
                            onClick = {  }
                        )
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                    append("Local Food\n")
                                }
                            },
                            onClick = {  }
                        )
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                    append("Museums\n")
                                }
                            },
                            onClick = {  }
                        )
                    }
                }
            }
        }
    }
}