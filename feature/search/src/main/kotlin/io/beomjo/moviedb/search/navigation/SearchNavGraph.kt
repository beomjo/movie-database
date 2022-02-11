package io.beomjo.moviedb.search.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.navigation.Destination
import io.beomjo.moviedb.navigation.Tab
import io.beomjo.moviedb.search.SearchScreen

fun NavGraphBuilder.searchNavGraph() {
    navigation(
        route = Tab.Search.path,
        startDestination = Destination.Search.path,
    ) {
        composable(Destination.Search.path) {
            SearchScreen()
        }
    }
}
