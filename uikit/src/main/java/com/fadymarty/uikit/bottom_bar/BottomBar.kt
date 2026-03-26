package com.fadymarty.uikit.bottom_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.common.theme.GameTimeTheme

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    selectedScreen: BottomBarScreen? = null,
    onScreenClick: (BottomBarScreen) -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(109.dp)
            .clip(BottomBarShape())
            .background(
                Brush.linearGradient(
                    colors = GameTimeTheme.colorScheme.accent
                )
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(81.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 22.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                BottomBarItem(
                    selected = BottomBarScreen.Statistics == selectedScreen,
                    screen = BottomBarScreen.Statistics,
                    onClick = {
                        onScreenClick(BottomBarScreen.Statistics)
                    }
                )
                Spacer(modifier = Modifier.width(26.dp))
                BottomBarItem(
                    selected = BottomBarScreen.DiscoverCombats == selectedScreen,
                    screen = BottomBarScreen.DiscoverCombats,
                    onClick = {
                        onScreenClick(BottomBarScreen.DiscoverCombats)
                    }
                )
                Spacer(modifier = Modifier.weight(1f))
                BottomBarItem(
                    selected = BottomBarScreen.Chat == selectedScreen,
                    screen = BottomBarScreen.Chat,
                    onClick = {
                        onScreenClick(BottomBarScreen.Chat)
                    }
                )
                Spacer(modifier = Modifier.width(38.dp))
                BottomBarItem(
                    selected = BottomBarScreen.Profile == selectedScreen,
                    screen = BottomBarScreen.Profile,
                    onClick = {
                        onScreenClick(BottomBarScreen.Profile)
                    }
                )
            }
            BottomBarActionButton(
                modifier = Modifier.offset(y = (-38).dp),
                screen = BottomBarScreen.ScheduleGame,
                onClick = {
                    onScreenClick(BottomBarScreen.ScheduleGame)
                }
            )
        }
    }
}

@Composable
private fun BottomBarItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    screen: BottomBarScreen,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier
            .clickable(
                interactionSource = null,
                indication = null,
                onClick = onClick
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Icon(
            modifier = Modifier.size(16.dp),
            imageVector = ImageVector.vectorResource(screen.icon),
            contentDescription = null,
            tint = GameTimeTheme.colorScheme.onAccent
        )
        Text(
            text = screen.label,
            style = if (selected) {
                GameTimeTheme.typography.caption2Bold
            } else GameTimeTheme.typography.caption2Regular,
            color = GameTimeTheme.colorScheme.onAccent
        )
    }
}

@Composable
private fun BottomBarActionButton(
    modifier: Modifier = Modifier,
    screen: BottomBarScreen,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .size(56.dp)
            .border(
                width = 5.dp,
                color = GameTimeTheme.colorScheme.onAccent,
                shape = CircleShape
            )
            .clip(CircleShape)
            .clickable(
                interactionSource = null,
                indication = null,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(24.dp, 29.dp),
            imageVector = ImageVector.vectorResource(screen.icon),
            contentDescription = null,
            tint = GameTimeTheme.colorScheme.onAccent
        )
    }
}

@Preview
@Composable
private fun BottomBarPreview() {
    GameTimeTheme {
        BottomBar(
            selectedScreen = BottomBarScreen.DiscoverCombats,
            onScreenClick = {}
        )
    }
}