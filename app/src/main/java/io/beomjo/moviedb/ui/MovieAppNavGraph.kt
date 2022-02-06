package io.beomjo.moviedb.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import io.beomjo.moviedb.home.navigation.homeNavGraph
import io.beomjo.moviedb.mypage.navigation.mypageNavGraph
import io.beomjo.moviedb.navigation.Route
import io.beomjo.moviedb.people.navigation.peopleNavGraph
import io.beomjo.moviedb.search.navigation.searchNavGraph

@Composable
fun MovieAppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Route.default.path,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        homeNavGraph()
        searchNavGraph()
        peopleNavGraph()
        mypageNavGraph()
    }
}