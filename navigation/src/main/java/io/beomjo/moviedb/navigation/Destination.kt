package io.beomjo.moviedb.navigation

enum class Destination(val path: String) {
    Home("/home") {
        override val children: List<Destination>
            get() = super.children
    },

    Search("/search") {
        override val children: List<Destination>
            get() = super.children
    },

    People("/people") {
        override val children: List<Destination>
            get() = super.children
    },

    MyPage("/mypage") {
        override val children: List<Destination>
            get() = super.children
    };

    open val children: List<Destination> = listOf()
}
