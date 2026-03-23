package com.fadymarty.uikit.common.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.fadymarty.uikit.R

val PublicSans = FontFamily(
    Font(R.font.public_sans_regular, FontWeight.W400),
    Font(R.font.public_sans_medium, FontWeight.W500),
    Font(R.font.public_sans_semibold, FontWeight.W600),
    Font(R.font.public_sans_bold, FontWeight.W700),
    Font(R.font.public_sans_extrabold, FontWeight.W800)
)

@Immutable
data class GameTimeTypography(
    val title1Semibold: TextStyle,
    val title1Extrabold: TextStyle,
    val title2Regular: TextStyle,
    val title2Semibold: TextStyle,
    val title2ExtraBold: TextStyle,
    val title3Regular: TextStyle,
    val title3Medium: TextStyle,
    val title3Semibold: TextStyle,
    val headlineRegular: TextStyle,
    val headlineMedium: TextStyle,
    val textRegular: TextStyle,
    val textMedium: TextStyle,
    val captionRegular: TextStyle,
    val captionSemibold: TextStyle,
    val caption2Regular: TextStyle,
    val caption2Bold: TextStyle,
)

val Typography = GameTimeTypography(
    title1Semibold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.0033.em
    ),
    title1Extrabold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W800,
        fontSize = 24.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.0033.em
    ),
    title2Regular = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.0038.em
    ),
    title2Semibold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.0038.em
    ),
    title2ExtraBold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W800,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.0038.em
    ),
    title3Regular = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 17.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.em
    ),
    title3Medium = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W500,
        fontSize = 17.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.em
    ),
    title3Semibold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W600,
        fontSize = 17.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.em
    ),
    headlineRegular = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = (-0.0032).em
    ),
    headlineMedium = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = (-0.0032).em
    ),
    textRegular = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 15.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.em
    ),
    textMedium = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 15.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.em
    ),
    captionRegular = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.em
    ),
    captionSemibold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.em
    ),
    caption2Regular = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.em
    ),
    caption2Bold = TextStyle(
        fontFamily = PublicSans,
        fontWeight = FontWeight.W700,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.em
    )
)

internal val LocalGameTimeTypography = staticCompositionLocalOf {
    Typography
}