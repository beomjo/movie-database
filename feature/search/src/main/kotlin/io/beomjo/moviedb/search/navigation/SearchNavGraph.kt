package io.beomjo.moviedb.search.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.navigation.Route

fun NavGraphBuilder.searchNavGraph() {
    navigation(
        route = "search",
        startDestination = Route.Search.name,
    ) {

    }
}