package io.beomjo.moviedb.mypage.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.navigation.Route

fun NavGraphBuilder.mypageNavGraph() {
    navigation(
        route = "mypage",
        startDestination = Route.MyPage.name,
    ) {
    }
}

