package com.fadymarty.uikit.common.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun GameTimeTheme(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalGameTimeColorScheme provides LightColorScheme,
        LocalGameTimeTypography provides Typography
    ) {
        MaterialTheme(
            colorScheme = lightColorScheme(
                primary = LightColorScheme.accentInactive,
                onPrimary = LightColorScheme.onAccent,
                background = LightColorScheme.background,
                onBackground = LightColorScheme.onBackground,
                surface = LightColorScheme.background,
                onSurface = LightColorScheme.onBackground
            ),
            content = content
        )
    }
}

object GameTimeTheme {

    val colorScheme: GameTimeColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalGameTimeColorScheme.current

    val typography: GameTimeTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalGameTimeTypography.current
}