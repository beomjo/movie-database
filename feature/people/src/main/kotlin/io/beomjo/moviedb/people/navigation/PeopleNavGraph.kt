package io.beomjo.moviedb.people.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.beomjo.moviedb.navigation.Destination
import io.beomjo.moviedb.navigation.Tab
import io.beomjo.moviedb.people.PeopleScreen

fun NavGraphBuilder.peopleNavGraph() {
    navigation(
        route = Tab.People.path,
        startDestination = Destination.People.path,
    ) {
        composable(Destination.People.path) {
            PeopleScreen()
        }
    }
}
