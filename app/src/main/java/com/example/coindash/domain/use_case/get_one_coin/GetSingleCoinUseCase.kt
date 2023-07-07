package com.example.coindash.domain.use_case.get_one_coin

import com.example.coindash.common.Resource
import com.example.coindash.data.remote.dto.toCoin
import com.example.coindash.data.remote.dto.toCoinDetail
import com.example.coindash.domain.model.Coin
import com.example.coindash.domain.model.CoinDetail
import com.example.coindash.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetSingleCoinUseCase @Inject constructor(private val coinRepository: CoinRepository) {

    operator fun invoke(coinId:String): Flow<Resource<List<CoinDetail>>> = flow {
        try {
            emit(Resource.Loading())
            val coin = coinRepository.getCoinById(coinId).toCoinDetail()
            Resource.Success(coin)
        } catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?:"An unexpected error occurred"))
        } catch (e: IOException){
            emit(Resource.Error(e.localizedMessage?:"No internet connection"))
        }

    }
}