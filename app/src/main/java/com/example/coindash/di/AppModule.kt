package com.example.coindash.di

import com.example.coindash.common.Constants
import com.example.coindash.data.remote.CoinPaprikaApi
import com.example.coindash.data.repository.CoinRepositoryImpl
import com.example.coindash.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCoinPaprikaApi():CoinPaprikaApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinPaprikaRepository(api:CoinPaprikaApi):CoinRepository{
        return CoinRepositoryImpl(api)
    }

}