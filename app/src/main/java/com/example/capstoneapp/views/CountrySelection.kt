package com.example.capstoneapp.views

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.capstoneapp.styles.LandingScreenStyle
import com.example.capstoneapp.ui.theme.Syne

class CountrySelection {
    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun LandingScreen(modifier: Modifier = Modifier, navController: NavController) {
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
            modifier = Modifier
                .background(LandingScreenStyle.BodyStyle.backgroundColor)
        ) {
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = LandingScreenStyle.HeaderStyle.backgroundColor)
                ) {
                    Text(
                        text = "Country Selection",
                        color = LandingScreenStyle.HeaderStyle.textColor,
                        textAlign = TextAlign.Start,
                        style = TextStyle(
                            fontFamily = Syne,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            // This adds a little bit of space between the sticky header and set of expandable cards
            item {
                Spacer(modifier = Modifier.height(16.dp))
            }

            items(countries.size) { index ->
                ExpandableCard(
                    country = countries[index],
                    navController = navController
                )
            }
        }
    }

    // Compose code for the expandable card function
    @Composable
    fun ExpandableCard(
        country: String,
        navController: NavController
    ) {
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
                            color = LandingScreenStyle.ExpandedCardStyle.textColor,
                            fontSize = LandingScreenStyle.ExpandedCardStyle.fontSize,
                            fontWeight = LandingScreenStyle.ExpandedCardStyle.fontWeight,
                            fontFamily = LandingScreenStyle.ExpandedCardStyle.fontFamily
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
                                withStyle(style = SpanStyle(
                                    color = LandingScreenStyle.ExpandedCardStyle.textColor,
                                    fontWeight = LandingScreenStyle.ExpandedCardStyle.fontWeight,
                                    fontFamily = LandingScreenStyle.ExpandedCardStyle.fontFamily
                                )) {
                                    append("Historical Locations\n")
                                }
                            },
                            onClick = { navController.navigate("map_screen") }
                        )
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = LandingScreenStyle.ExpandedCardStyle.textColor,
                                    fontWeight = LandingScreenStyle.ExpandedCardStyle.fontWeight,
                                    fontFamily = LandingScreenStyle.ExpandedCardStyle.fontFamily
                                )) {
                                    append("Cultural Centers\n")
                                }
                            },
                            onClick = {  }
                        )
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = LandingScreenStyle.ExpandedCardStyle.textColor,
                                    fontWeight = LandingScreenStyle.ExpandedCardStyle.fontWeight,
                                    fontFamily = LandingScreenStyle.ExpandedCardStyle.fontFamily
                                )) {
                                    append("Local Food\n")
                                }
                            },
                            onClick = {  }
                        )
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = LandingScreenStyle.ExpandedCardStyle.textColor,
                                    fontWeight = LandingScreenStyle.ExpandedCardStyle.fontWeight,
                                    fontFamily = LandingScreenStyle.ExpandedCardStyle.fontFamily
                                )) {
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