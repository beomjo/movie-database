package io.beomjo.moviedb.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import io.beomjo.moviedb.navigation.Tab
import io.beomjo.moviedb.ui.component.BottomNavigation
import io.beomjo.moviedb.ui.theme.MyApplicationTheme

@Composable
fun MovieApp() {
    MyApplicationTheme {
        val navController = rememberNavController()
        val defaultTab = Tab.Home.path
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                bottomBar = {
                    BottomNavigation(
                        navController = navController,
                        defaultTabPath = defaultTab
                    )
                }
            ) {
                MovieAppNavGraph(
                    navController = navController,
                    startDestination = defaultTab
                )
            }
        }
    }
}
