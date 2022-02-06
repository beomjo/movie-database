package io.beomjo.moviedb.search.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.search.SearchScreen

fun NavGraphBuilder.searchNavGraph() {
    navigation(
        route = "search",
        startDestination = "search/",
    ) {
        composable("search/") {
            SearchScreen()
        }
    }
}
