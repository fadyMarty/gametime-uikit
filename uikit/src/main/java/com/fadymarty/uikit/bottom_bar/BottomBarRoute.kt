package com.fadymarty.uikit.bottom_bar

import kotlinx.serialization.Serializable

sealed interface BottomBarRoute {

    @Serializable
    data object Statistics : BottomBarRoute

    @Serializable
    data object DiscoverCombats : BottomBarRoute

    @Serializable
    data object ScheduleGame : BottomBarRoute

    @Serializable
    data object Chat : BottomBarRoute

    @Serializable
    data object Profile : BottomBarRoute
}