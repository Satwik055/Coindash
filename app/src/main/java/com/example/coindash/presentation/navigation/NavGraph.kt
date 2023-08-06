package com.example.coindash.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.coindash.presentation.coin_list_screen.CoinListScreen
import com.example.coindash.presentation.detail_screen.CoinDetailScreen

@Composable
fun SetupNavGraph(navController:NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.CoinListScreen.route
    ){
        composable(
            route = Screen.CoinListScreen.route
        ){
            CoinListScreen(navController = navController)
        }
        composable(
            route = Screen.CoinDetailScreen.route + "/{coinId}"
        ){
            CoinDetailScreen()
        }
    }
}