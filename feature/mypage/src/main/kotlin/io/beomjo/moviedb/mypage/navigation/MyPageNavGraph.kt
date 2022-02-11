package io.beomjo.moviedb.mypage.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.mypage.MyPageScreen
import io.beomjo.moviedb.navigation.Destination
import io.beomjo.moviedb.navigation.Tab

fun NavGraphBuilder.mypageNavGraph() {
    navigation(
        route = Tab.MyPage.path,
        startDestination = Destination.MyPage.path,
    ) {
        composable(Destination.MyPage.path) {
            MyPageScreen()
        }
    }
}
