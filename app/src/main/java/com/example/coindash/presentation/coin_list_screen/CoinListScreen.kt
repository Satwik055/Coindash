package com.example.coindash.presentation.coin_list_screen


import android.util.Log
import com.example.coindash.presentation.coin_list_screen.components.CoinListItem
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.coindash.presentation.navigation.Screen

@Composable
fun CoinListScreen(
    navController:NavController,
    viewModel:CoinListViewModel = hiltViewModel()
){
    val state = viewModel.state.value

    Column {
        Spacer(
            modifier = Modifier.height(10.dp)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            items(state.coins){coin ->
                CoinListItem(
                    coin = coin,
                    onItemClick = {
                    navController.navigate(
                        Screen.CoinDetailScreen.route + "/${coin.id}"
                    )
                })
            }
        }

        if(state.error.isNotBlank()){
            Text(
                text = state.error,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }

        if(state.isLoading){
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoinListScreen(navController = rememberNavController())
}