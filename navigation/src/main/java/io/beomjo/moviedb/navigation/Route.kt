package io.beomjo.moviedb.navigation

enum class Route(val path: String) {
    Home("home") {
        override val isTabRoute: Boolean
            get() = true

        override val children: List<Route>
            get() = super.children
    },

    Search("search") {
        override val isTabRoute: Boolean
            get() = true
        override val children: List<Route>
            get() = super.children
    },

    People("people") {
        override val isTabRoute: Boolean
            get() = true
        override val children: List<Route>
            get() = super.children
    },

    MyPage("mypage") {
        override val isTabRoute: Boolean
            get() = true
        override val children: List<Route>
            get() = super.children
    };

    open val isTabRoute = false

    open val children: List<Route> = listOf()

    companion object {
        val default = Home
    }
}