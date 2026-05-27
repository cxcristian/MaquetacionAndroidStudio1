package com.sena.firstproject3114227.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
        composable(route ="dashboard/{id}?nombre={nombre}",
            arguments = listOf(
                navArgument("id"){
                    type = NavType.IntType
                },
                navArgument("nombre"){
                    type = NavType.StringType
                }
            )){data ->
            val id = data.arguments?.getInt("id")?:0
            val nombre = data.arguments?.getString("nombre")?:"Sin Nombre"
            DashboadScreen(modifier = Modifier.padding(0.dp), navController, id, nombre)
        }
    }
}