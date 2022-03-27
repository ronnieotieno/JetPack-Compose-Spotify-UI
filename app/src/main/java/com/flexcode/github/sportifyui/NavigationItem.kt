package com.flexcode.github.sportifyui

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Search : NavigationItem("search", R.drawable.ic_search, "Search")
    object Library : NavigationItem("library", R.drawable.ic_library, "Library")
    object Premium : NavigationItem("premium", R.drawable.spotify, "Premium")
}