package com.fadymarty.uikit.buttons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
 * Третичная кнопка
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param icon иконка
 * @param label текст на кнопке
 * @param onClick действие при нажатии
 */
@Composable
fun TertiaryButton(
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    label: String,
    onClick: () -> Unit,
) {
    Row(
        modifier = modifier.clickable(
            interactionSource = null,
            indication = null,
            onClick = onClick
        ),
        horizontalArrangement = Arrangement.spacedBy(18.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (icon != null) {
            Icon(
                modifier = Modifier.size(18.dp),
                imageVector = icon,
                contentDescription = null,
                tint = GameTimeTheme.colorScheme.accentInactive
            )
        }
        Text(
            text = label,
            style = GameTimeTheme.typography.headlineRegular
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TertiaryButtonPreview() {
    GameTimeTheme {
        TertiaryButton(
            icon = ImageVector.vectorResource(R.drawable.ic_logout),
            label = "Logout",
            onClick = {}
        )
    }
}