package com.example.coindash.presentation.navigation

sealed class Screen(val route:String){
    object CoinListScreen:Screen("coinList_screen")
    object CoinDetailScreen:Screen("coinDetail_screen")
}
