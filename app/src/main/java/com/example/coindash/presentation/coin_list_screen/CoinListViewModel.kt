package com.example.coindash.presentation.coin_list_screen

import androidx.lifecycle.ViewModel
import com.example.coindash.common.Resource
import com.example.coindash.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(private val getCoinsUseCase: GetCoinsUseCase):ViewModel() {

    fun getCoins(){
        getCoinsUseCase().onEach {result->
            when(result){
                is Resource.Success ->{
                    TODO()
                }
                is Resource.Error ->{
                    TODO()
                }
                is Resource.Loading ->{
                    TODO()
                }
            }
        }
    }
}