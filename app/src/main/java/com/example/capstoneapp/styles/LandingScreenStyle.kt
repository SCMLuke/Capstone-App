package com.example.capstoneapp.styles

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.capstoneapp.ui.theme.Nunito

class LandingScreenStyle {

    object BodyStyle {
        val backgroundColor: Color = Color(0xFF474747)
    }
    object HeaderStyle {
        val backgroundColor: Color = Color(0xFF6E7E85)
        val textColor: Color = Color(0xFFD1D1D1)
    }
    object ExpandedCardStyle {
        val textColor: Color = Color(0xFFD1D1D1)
        val fontSize = 20.sp
        val fontWeight = FontWeight.Bold
        val fontFamily = Nunito
    }
}