package com.example.coindash.data

import com.example.coindash.domain.model.CoinDummy

object DummyData {
    private val coin1 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin2 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin3 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin4 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin5 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin6 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin7 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin8 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin9 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )
    private val coin10 = CoinDummy("Ethereum","ETH", 10900.00, 12.08 )

    private val list =  ArrayList<CoinDummy>()
    fun dummyCoinList(): ArrayList<CoinDummy> {
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