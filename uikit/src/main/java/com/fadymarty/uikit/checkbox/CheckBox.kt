package com.fadymarty.uikit.checkbox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.R
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Checkbox
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param checked включен checkbox или нет
 * @param onClick действие при нажатии
 */
@Composable
fun Checkbox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onClick: () -> Unit,
) {
    Icon(
        modifier = modifier
            .size(14.dp)
            .clickable(
                interactionSource = null,
                indication = null,
                onClick = onClick
            ),
        imageVector = if (checked) {
            ImageVector.vectorResource(R.drawable.ic_checkbox)
        } else {
            ImageVector.vectorResource(R.drawable.ic_checkbox_blank)
        },
        contentDescription = null,
        tint = GameTimeTheme.colorScheme.accentInactive
    )
}

@Preview
@Composable
private fun CheckboxPreview() {
    GameTimeTheme {
        Checkbox(
            checked = true,
            onClick = {}
        )
    }
}