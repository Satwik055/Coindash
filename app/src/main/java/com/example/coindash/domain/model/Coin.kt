package com.example.coindash.domain.model

data class Coin(
    val name:String,
    val symbol:String,
    val price: Double,
    val changeIn24Hrs: Double
)
