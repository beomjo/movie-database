package io.beomjo.moviedb.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.home.HomeScreen
import io.beomjo.moviedb.navigation.Destination
import io.beomjo.moviedb.navigation.Tab

fun NavGraphBuilder.homeNavGraph() {
    navigation(
        route = Tab.Home.path,
        startDestination = Destination.Home.path,
    ) {
        composable(Destination.Home.path) {
            HomeScreen()
        }
    }
}
