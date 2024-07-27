package com.afirmo.movieapp.framework.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val title: String, val icon: ImageVector, val route: String) {

    object MoviePupular : BottomNavItem("Populares", Icons.Default.Home, "movie_popular_screen")
    object SearchMovie : BottomNavItem("Busca", Icons.Default.Search, "movie_popular_screen")
    object MovieFavories : BottomNavItem("Favoritos", Icons.Default.Favorite, "movie_favorited_screen")


}