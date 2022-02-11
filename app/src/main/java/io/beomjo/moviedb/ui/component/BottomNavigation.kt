package io.beomjo.moviedb.ui.component

import androidx.compose.foundation.Image
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import io.beomjo.moviedb.navigation.Tab
import io.beomjo.moviedb.navigation.findStartDestination

@Composable
fun BottomNavigation(
    navController: NavController,
    defaultTabPath: String,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: defaultTabPath
    val tabs = Tab.values().toList()
    BottomNavigation {
        tabs.forEach { tab ->
            val isSelected = currentRoute.contains(tab.path)
            BottomNavigationItem(
                icon = {
                    Image(
                        painterResource(tab.iconRes),
                        alpha = if (isSelected) 1f else 0.5f,
                        contentDescription = "",
                    )
                },
                label = { Text(text = tab.name, fontSize = 9.sp) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = isSelected,
                onClick = {
                    navController.navigate(tab.path) {
                        launchSingleTop = true
                        restoreState = true
                        val startDestination = findStartDestination(navController.graph)
                        popUpTo(startDestination.id) {
                            saveState = true
                        }
                    }
                }
            )
        }
    }
}
