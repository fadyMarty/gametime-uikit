package com.fadymarty.uikit.bottom_bar

import androidx.annotation.DrawableRes
import com.fadymarty.uikit.R

sealed class BottomBarScreen(
    @DrawableRes
    val icon: Int,
    val label: String,
    val route: BottomBarRoute,
) {
    data object Statistics : BottomBarScreen(
        icon = R.drawable.ic_statistics,
        label = "Statistics",
        route = BottomBarRoute.Statistics
    )

    data object DiscoverCombats : BottomBarScreen(
        icon = R.drawable.ic_location_pin,
        label = "Discover",
        route = BottomBarRoute.DiscoverCombats
    )

    data object ScheduleGame : BottomBarScreen(
        icon = R.drawable.ic_schedule,
        label = "Schedule",
        route = BottomBarRoute.ScheduleGame
    )

    data object Chat : BottomBarScreen(
        icon = R.drawable.ic_chat,
        label = "Chat",
        route = BottomBarRoute.Chat
    )

    data object Profile : BottomBarScreen(
        icon = R.drawable.ic_profile,
        label = "Profile",
        route = BottomBarRoute.Profile
    )
}