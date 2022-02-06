package io.beomjo.moviedb.people.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.navigation.Route


fun NavGraphBuilder.peopleNavGraph() {
    navigation(
        route = "people",
        startDestination = Route.People.name,
    ) {
    }
}

