package com.fadymarty.uikit.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.R
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Карточка
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param title заголовок
 * @param description описание
 * @param image картинка
 * @param onClick действие при нажатии на карточку
 */
@Composable
fun LandingCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    image: Painter,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(169.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                Brush.linearGradient(
                    colors = GameTimeTheme.colorScheme.accent
                )
            )
            .clickable(onClick = onClick)
    ) {
        Image(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.CenterEnd),
            painter = image,
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 24.dp)
                .padding(top = 30.dp, bottom = 23.67.dp)
        ) {
            Text(
                text = title,
                style = GameTimeTheme.typography.caption2Bold,
                color = GameTimeTheme.colorScheme.onAccent
            )
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                modifier = Modifier.widthIn(max = 175.dp),
                text = description,
                style = GameTimeTheme.typography.caption2Regular,
                color = GameTimeTheme.colorScheme.onAccent
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                modifier = Modifier.width(14.dp),
                imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_forward),
                contentDescription = null,
                tint = GameTimeTheme.colorScheme.onAccent
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LandingPreview() {
    GameTimeTheme {
        LandingCard(
            title = "Schedule",
            description = "Easily schedule event/games\nthen find like minded players for battle. You up for it?",
            image = painterResource(R.drawable.img_schedule),
            onClick = {}
        )
    }
}