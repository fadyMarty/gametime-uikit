package com.fadymarty.gametime.uikit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.R
import com.fadymarty.uikit.bottom_bar.BottomBar
import com.fadymarty.uikit.bottom_bar.BottomBarScreen
import com.fadymarty.uikit.buttons.PrimaryButton
import com.fadymarty.uikit.buttons.TertiaryButton
import com.fadymarty.uikit.card.LandingCard
import com.fadymarty.uikit.checkbox.Checkbox
import com.fadymarty.uikit.common.theme.GameTimeTheme
import com.fadymarty.uikit.indicator.Pagination
import com.fadymarty.uikit.inputs.Input
import com.fadymarty.uikit.inputs.PasswordInput
import com.fadymarty.uikit.select.Select
import com.fadymarty.uikit.timer.Timer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameTimeTheme {
                Scaffold(
                    contentWindowInsets = WindowInsets.systemBars
                        .union(WindowInsets.displayCutout)
                        .add(WindowInsets(24.dp, 24.dp, 24.dp, 24.dp))
                ) { innerPadding ->
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = innerPadding,
                        verticalArrangement = Arrangement.spacedBy(64.dp)
                    ) {
                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(24.dp)
                            ) {
                                Input(
                                    state = rememberTextFieldState(),
                                    placeholder = "Full Name"
                                )
                                PasswordInput(
                                    state = rememberTextFieldState(),
                                    isPasswordVisible = false,
                                    onTogglePasswordVisibility = {},
                                    placeholder = "Password"
                                )
                                PasswordInput(
                                    state = rememberTextFieldState(),
                                    isPasswordVisible = true,
                                    onTogglePasswordVisibility = {},
                                    placeholder = "Password"
                                )
                            }
                        }
                        item {
                            Select(
                                label = "FROM",
                                value = "MON, NOV 4,2019",
                                onClick = {}
                            )
                        }
                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(24.dp)
                            ) {
                                PrimaryButton(
                                    label = "Let’s Combat!",
                                    onClick = {}
                                )
                                TertiaryButton(
                                    icon = ImageVector.vectorResource(R.drawable.ic_logout),
                                    label = "Logout",
                                    onClick = {}
                                )
                            }
                        }
                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(24.dp)
                            ) {
                                Pagination(
                                    pageCount = 3,
                                    currentPage = 0
                                )
                                Pagination(
                                    pageCount = 3,
                                    currentPage = 1
                                )
                                Pagination(
                                    pageCount = 3,
                                    currentPage = 2
                                )
                            }
                        }
                        item {
                            LandingCard(
                                title = "Schedule",
                                description = "Easily schedule event/games\nthen find like minded players for battle. You up for it?",
                                image = painterResource(R.drawable.img_schedule),
                                onClick = {}
                            )
                        }
                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(24.dp)
                            ) {
                                BottomBar(
                                    selectedScreen = BottomBarScreen.Statistics,
                                    onItemClick = {}
                                )
                                BottomBar(
                                    selectedScreen = BottomBarScreen.DiscoverCombats,
                                    onItemClick = {}
                                )
                                BottomBar(
                                    selectedScreen = BottomBarScreen.ScheduleGame,
                                    onItemClick = {}
                                )
                                BottomBar(
                                    selectedScreen = BottomBarScreen.Chat,
                                    onItemClick = {}
                                )
                                BottomBar(
                                    selectedScreen = BottomBarScreen.Profile,
                                    onItemClick = {}
                                )
                            }
                        }
                        item {
                            Timer(
                                remainingSeconds = 0
                            )
                        }
                        item {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(24.dp)
                            ) {
                                Checkbox(
                                    checked = true,
                                    onClick = {}
                                )
                                Checkbox(
                                    checked = false,
                                    onClick = {}
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}