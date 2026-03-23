package com.fadymarty.uikit.indicator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Индикатор странц
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param pageCount количество страниц
 * @param currentPage индекс текущей страницы
 */
@Composable
fun Pagination(
    modifier: Modifier = Modifier,
    pageCount: Int,
    currentPage: Int,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        repeat(pageCount) { index ->
            Box(
                modifier = Modifier
                    .alpha(
                        alpha = if (index == currentPage) 1f else 0.35f
                    )
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(GameTimeTheme.colorScheme.accentInactive)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PaginationPreview() {
    GameTimeTheme {
        Pagination(
            pageCount = 3,
            currentPage = 0
        )
    }
}