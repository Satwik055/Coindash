package com.example.coindash.presentation.coin_list_screen

import com.example.coindash.domain.model.Coin

data class CoinListState(
    val isLoading:Boolean = false,
    val coins:List<Coin> = emptyList(),
    val error:String = ""
)
