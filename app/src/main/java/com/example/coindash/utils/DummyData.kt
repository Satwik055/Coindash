package com.example.coindash.utils

import com.example.coindash.model.Coin

object DummyData {
    private val coin1 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin2 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin3 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin4 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin5 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin6 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin7 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin8 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin9 = Coin("Ethereum","ETH", 10900.00, 12.08 )
    private val coin10 = Coin("Ethereum","ETH", 10900.00, 12.08 )

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