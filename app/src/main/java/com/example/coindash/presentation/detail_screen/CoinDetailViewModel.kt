package com.example.coindash.presentation.detail_screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.Constraints
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coindash.common.Constants
import com.example.coindash.common.Resource
import com.example.coindash.domain.use_case.get_coins.GetCoinsUseCase
import com.example.coindash.domain.use_case.get_one_coin.GetSingleCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val getSingleCoinUseCase: GetSingleCoinUseCase,
    savedStateHandle:SavedStateHandle
):ViewModel() {

    private val _state = mutableStateOf(CoinDetailState())
    val state: State<CoinDetailState> = _state


    init {
        savedStateHandle.get<String>(Constants.PARAM_COIN_ID)?.let{ coinId ->
            getaSingleCoin(coinId)
        }
    }


    private fun getaSingleCoin(coinId:String){
        getSingleCoinUseCase(coinId).onEach {result->
            when(result){
                is Resource.Success ->{
                    _state.value = CoinDetailState(coinDetail = result.data)
                }
                is Resource.Error ->{
                    _state.value = CoinDetailState(error = result.message?:"An unexpected error occurred")
                }
                is Resource.Loading ->{
                    _state.value = CoinDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}