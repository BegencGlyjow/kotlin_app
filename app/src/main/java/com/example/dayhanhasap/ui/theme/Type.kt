package com.example.dayhanhasap.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.unit.sp
import com.example.dayhanhasap.R

// Set of Material typography styles to start with
val fonts = FontFamily(
    Font(R.font.monsterratbold,weight = FontWeight.Bold),
    Font(R.font.montserratmedium,weight = FontWeight.Medium)
)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp
    ),

    h2 = TextStyle(
            fontFamily = fonts,
        fontWeight = FontWeight.Medium
            )

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)