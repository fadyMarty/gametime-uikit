package com.fadymarty.uikit.select

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.R
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Селект
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param label заголовок
 * @param value текущее значение
 * @param onClick действие при нажатии на селект
 */
@Composable
fun Select(
    modifier: Modifier = Modifier,
    label: String = "",
    value: String,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = label,
            style = GameTimeTheme.typography.caption2Regular,
            color = GameTimeTheme.colorScheme.accentInactive
        )
        Row(
            modifier = Modifier
                .clickable(
                    interactionSource = null,
                    indication = null,
                    onClick = onClick
                ),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = value,
                style = GameTimeTheme.typography.caption2Regular
            )
            Icon(
                modifier = Modifier.size(8.dp, 4.dp),
                imageVector = ImageVector.vectorResource(R.drawable.ic_dropdown),
                contentDescription = null,
                tint = GameTimeTheme.colorScheme.accentInactive
            )
        }
    }
}

@Preview
@Composable
private fun SelectPreview() {
    GameTimeTheme {
        Select(
            label = "FROM",
            value = "MON, NOV 4,2019",
            onClick = {}
        )
    }
}