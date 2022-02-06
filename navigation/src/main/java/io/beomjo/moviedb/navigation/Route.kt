
package io.beomjo.moviedb.navigation

sealed class Route(val name: String) {
    object Home : Route("home")
    object Search : Route("search")
    object People : Route("people")
    object MyPage : Route("mypage")
}