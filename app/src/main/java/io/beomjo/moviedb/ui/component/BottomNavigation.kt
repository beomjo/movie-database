package io.beomjo.moviedb.ui.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import io.beomjo.moviedb.navigation.Route
import io.beomjo.moviedb.navigation.findStartDestination

@Composable
fun BottomNavigation(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: Route.default
    val tabs = Route.values().filter { it.isTabRoute }.toList()
    BottomNavigation {
        tabs.forEach { tab ->
            BottomNavigationItem(
                icon = {
//                    Image(
//                        painterResource(tab.icon),
//                        contentDescription = "",
//                    )
                },
                label = { Text(text = tab.name, fontSize = 9.sp) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == tab.path,
                onClick = {
                    if (tab.path != currentRoute) {
                        navController.navigate(tab.path) {
                            launchSingleTop = true
                            restoreState = true
                            // Pop up backstack to the first destination and save state. This makes going back
                            // to the start destination when pressing back in any other bottom tab.
                            val startDestination = findStartDestination(navController.graph)
                            popUpTo(startDestination.id) {
                                saveState = true
                            }
                        }
                    }
                }
            )
        }
    }
}
