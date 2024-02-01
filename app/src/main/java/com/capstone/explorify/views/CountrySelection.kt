package com.capstone.explorify.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CountrySelection {
    @Composable
    fun LandingScreen(modifier: Modifier = Modifier) {
        val countries = listOf("America", "Argentina", "Bhutan", "Canada", "France", "Greece", "Iran", "Mexico", "Netherlands", "Sweden")

        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color(0xff273537))
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(height = 90.dp)
                        .background(color = Color(0xff254954))
                ) {
                    Text(
                        text = "Country Selection",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Bold,
                            shadow = Shadow(
                                color = Color.Black.copy(alpha = 0.25f),
                                offset = Offset(0f, 4f),
                                blurRadius = 4f
                            )
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(height = 90.dp)
                            .border(border = BorderStroke(1.dp, Color(0xff282828)))
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
            }

            items(countries.size) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(85.dp)
                        .padding(vertical = 8.dp, horizontal = 20.dp)
                        .clip(shape = RoundedCornerShape(25.dp))
                        .background(color = Color(0xff8db2b2))
                ) {
                    Text(
                        text = countries[index],
                        color = Color(0xff0f0f0f),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Light
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
            }
        }
    }

    @Preview
    @Composable
    private fun LandingScreenPreview() {
        LandingScreen(Modifier)
    }
}