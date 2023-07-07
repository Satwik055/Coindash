package com.example.coindash.domain.repository

import com.example.coindash.data.remote.dto.CoinDetailDto
import com.example.coindash.data.remote.dto.CoinDto
import retrofit2.http.Path

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(@Path("coinId") coinId:String): CoinDetailDto
}