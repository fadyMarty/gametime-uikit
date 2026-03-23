package com.fadymarty.uikit.timer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.common.theme.GameTimeTheme

/** Таймер
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param remainingSeconds оставшееся количество секунд
 */
@Composable
fun Timer(
    modifier: Modifier = Modifier,
    remainingSeconds: Int,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(
                Brush.linearGradient(
                    colors = GameTimeTheme.colorScheme.accent
                )
            )
            .padding(top = 7.dp, bottom = 15.82.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Timer",
            style = GameTimeTheme.typography.caption2Regular,
            color = GameTimeTheme.colorScheme.onAccent
        )
        Spacer(modifier = Modifier.height(14.dp))
        Text(
            text = formatTime(remainingSeconds),
            style = GameTimeTheme.typography.title1Extrabold,
            color = GameTimeTheme.colorScheme.onAccent
        )
    }
}

private fun formatTime(remainingSeconds: Int): String {
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60

    return "%02d:%02d".format(minutes, seconds)
}

@Preview
@Composable
private fun TimerPreview() {
    GameTimeTheme {
        Timer(
            remainingSeconds = 0
        )
    }
}