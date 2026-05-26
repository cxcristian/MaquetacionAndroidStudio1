package com.sena.firstproject3114227.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sena.firstproject3114227.ui.screens.DashboadScreen
import com.sena.firstproject3114227.ui.screens.HomeScreen

@Composable
fun AppNavigation(modifier: Modifier){
    val  navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home",
    ){
        composable( route = "home"){
            HomeScreen(modifier = Modifier.padding(), navController)
        }
        composable(route ="dashboard"){
            DashboadScreen(modifier = Modifier.padding(), navController)
        }
    }
}