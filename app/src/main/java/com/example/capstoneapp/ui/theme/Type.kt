package com.example.capstoneapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.capstoneapp.R

// Font families
val Noto = FontFamily(
    Font(R.font.notosansdisplay_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.notosansdisplay_italic, FontWeight.Normal, FontStyle.Italic)
)

val RedhatDisplay = FontFamily(
    Font(R.font.redhatdisplay_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.redhatdisplay_italic, FontWeight.Normal, FontStyle.Italic)
)

val Nunito = FontFamily(
    Font(R.font.nunito_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.nunito_italic, FontWeight.Normal, FontStyle.Italic)
)

val Syne = FontFamily(
    Font(R.font.syne_regular, FontWeight.Normal, FontStyle.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)