package com.example.coindash.data.remote.dto

import com.example.coindash.domain.model.Coin

data class CoinDto(
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        rank = rank,
        symbol= symbol,
        type = type
    )
}