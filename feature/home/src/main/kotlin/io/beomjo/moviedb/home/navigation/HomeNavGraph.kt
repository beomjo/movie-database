package io.beomjo.moviedb.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.home.HomeScreen
import io.beomjo.moviedb.navigation.Route


fun NavGraphBuilder.homeNavGraph() {
    navigation(
        route = "home",
        startDestination = "home/",
    ) {
        composable("home/") {
            HomeScreen()
        }
    }
}