package com.example.coindash.utils

import com.example.coindash.domain.model.Coin


object DummyData {
    private val coin1 = Coin("1","BTC", "Bitcoin", true )
    private val coin2 = Coin("2","ETH", "Ethereum", true )
    private val coin3 = Coin("3","USDT", "Tether", true )
    private val coin4 = Coin("4","USDC", "USD Coin", true)
    private val coin5 = Coin("5","ADA", "Cardano", true )
    private val coin6 = Coin("6","DOGE", "Dogecoin", true )
    private val coin7 = Coin("7","SOL", "Solana", true )
    private val coin8 = Coin("8","LITE", "Litecoin", true )
    private val coin9 = Coin("9","MATIC", "Polygon", false )
    private val coin10 = Coin("10","DOT", "Polkadot", false )

    private val list =  ArrayList<Coin>()
    fun dummyCoinList(): ArrayList<Coin> {
        list.add(coin1)
        list.add(coin2)
        list.add(coin3)
        list.add(coin4)
        list.add(coin5)
        list.add(coin6)
        list.add(coin7)
        list.add(coin2)
        list.add(coin8)
        list.add(coin9)
        list.add(coin10)
        return list
    }



}