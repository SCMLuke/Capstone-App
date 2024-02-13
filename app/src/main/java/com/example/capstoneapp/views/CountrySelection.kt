package com.example.capstoneapp.views

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            modifier = Modifier.background(Color(0xff727272))
        ) {
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xff254954))
                ) {
                    Text(
                        text = "Country Selection",
                        color = Color.White,
                        textAlign = TextAlign.Start,
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            items(countries.size) { index ->
                ExpandableCard(country = countries[index])
            }
        }
    }

    // Compose code for the expandable card function
    @Composable
    fun ExpandableCard(country: String) {
        var expanded by remember { mutableStateOf(false) }

        ElevatedCard(
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF89E9F3)
            ),
            elevation = CardDefaults.cardElevation(
               defaultElevation = 8.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 3.dp, horizontal = 8.dp)
                .clickable { expanded = !expanded }
        ) {
            Box(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = country,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Light
                    )
                )

                // Code block to handle expansion event of card
                if (expanded) {
                    // TODO: Add some code
                }
            }
        }
    }
}