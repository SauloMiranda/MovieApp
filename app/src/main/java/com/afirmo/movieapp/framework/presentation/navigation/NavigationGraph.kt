package com.afirmo.movieapp.framework.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavigationGraph(navHostController: NavHostController, modifier: Modifier) {

    NavHost(
        navController = navHostController,
        startDestination = BottomNavItem.MoviePopular.route,
        modifier = modifier
    ) {
        composable(BottomNavItem.MoviePopular.route) {
            BottomNavItem.MoviePopular
        }
        composable(BottomNavItem.SearchMovie.route) {
            BottomNavItem.SearchMovie
        }
        composable(BottomNavItem.MovieFavories.route) {
            BottomNavItem.MovieFavories
        }
    }
}
