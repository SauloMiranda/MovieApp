package com.afirmo.movieapp.framework.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.afirmo.movieapp.framework.presentation.navigation.BottomNavigationBar
import com.afirmo.movieapp.framework.presentation.navigation.NavigationGraph

@Composable
fun MainScreen(navHostController: NavHostController) {
    
    Scaffold(
        bottomBar = { BottomNavigationBar(navHostController) },
        content = { innerPadding ->
            NavigationGraph(navHostController = navHostController, modifier = Modifier.padding(innerPadding))
        }
    )
}
