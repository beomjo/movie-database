package io.beomjo.moviedb.navigation

import androidx.navigation.NavDestination
import androidx.navigation.NavGraph

tailrec fun findStartDestination(graph: NavDestination): NavDestination {
    return if (graph is NavGraph) findStartDestination(graph.startDestination!!) else graph
}

val NavGraph.startDestination: NavDestination?
    get() = findNode(startDestinationId)