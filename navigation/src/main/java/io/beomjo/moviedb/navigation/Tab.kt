package io.beomjo.moviedb.navigation

import androidx.annotation.DrawableRes

enum class Tab(
    val path: String,
    @DrawableRes val iconRes: Int,
) {
    Home("home", R.drawable.ic_home),
    Search("search", R.drawable.ic_search),
    People("people", R.drawable.ic_people),
    MyPage("mypage", R.drawable.ic_more);
}
