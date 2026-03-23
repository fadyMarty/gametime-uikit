package com.fadymarty.uikit.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Первичная кнопка
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param label текст на кнопке
 * @param onClick действие при нажатии
 */
@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .size(210.dp, 58.dp)
            .clip(RoundedCornerShape(100.dp))
            .background(
                Brush.linearGradient(
                    colors = GameTimeTheme.colorScheme.accent
                )
            )
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = label,
            style = GameTimeTheme.typography.captionSemibold,
            textAlign = TextAlign.Center,
            color = GameTimeTheme.colorScheme.onAccent,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PrimaryButtonPreview() {
    GameTimeTheme {
        PrimaryButton(
            label = "Let’s Combat!",
            onClick = {}
        )
    }
}