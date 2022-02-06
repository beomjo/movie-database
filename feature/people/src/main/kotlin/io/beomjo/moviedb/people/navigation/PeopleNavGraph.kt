package io.beomjo.moviedb.people.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.people.PeopleScreen

fun NavGraphBuilder.peopleNavGraph() {
    navigation(
        route = "people",
        startDestination = "people/",
    ) {
        composable("people/") {
            PeopleScreen()
        }
    }
}
