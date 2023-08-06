package com.example.coindash.presentation.detail_screen

import com.example.coindash.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean = false,
    val coinDetail: CoinDetail? = null,
    val error:String = ""
)
