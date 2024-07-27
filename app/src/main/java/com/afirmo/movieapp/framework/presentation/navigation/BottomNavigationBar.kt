package com.afirmo.movieapp.framework.presentation.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.afirmo.movieapp.ui.theme.black
import com.afirmo.movieapp.ui.theme.yellow

@Composable
fun BottomNavigationBar(
    navController: NavController
) {

    val items = listOf(
        BottomNavItem.MoviePupular,
        BottomNavItem.SearchMovie,
        BottomNavItem.MovieFavories
    )
    BottomNavigation(
        contentColor = yellow,
        backgroundColor = black
    ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { destination ->
            BottomNavigationItem(selected = currentRoute == destination.route,
                onClick = {
                    navController.navigate(destination.route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                icon = { Icon(destination.icon, contentDescription = destination.title) },
                label = { Text(text = destination.title) }
            )
        }

    }

}

@Preview
@Composable
private fun BottomNavigatePreview() {
    BottomNavigationBar(navController = rememberNavController())

}