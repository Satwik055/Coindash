package com.example.coindash.data.repository

import com.example.coindash.data.remote.CoinPaprikaApi
import com.example.coindash.data.remote.dto.CoinDetailDto
import com.example.coindash.data.remote.dto.CoinDto
import com.example.coindash.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api:CoinPaprikaApi):CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }


}