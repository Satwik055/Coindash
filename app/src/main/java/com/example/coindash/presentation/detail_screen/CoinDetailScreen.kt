package com.example.coindash.presentation.detail_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.coindash.presentation.coin_list_screen.CoinListViewModel
import com.example.coindash.presentation.detail_screen.components.TeamMemberListItem
import com.example.coindash.presentation.theme.Manrope
import com.example.coindash.presentation.theme.White
import com.example.coindash.utils.DummyData

@Composable
fun CoinDetailScreen(
    viewModel: CoinDetailViewModel = hiltViewModel()
){
    val state = viewModel.state.value
    Column(
        modifier = Modifier.padding(start = 16.dp , end = 16.dp )
    ) {

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = state.coinDetail?.name ?: "" ,
            color = White,
            fontFamily = Manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 36.sp
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = state.coinDetail?.description ?: "",
            color = White,
            fontFamily = Manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Team Members",
            color = White,
            fontFamily = Manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )

        LazyColumn{
            items(state.coinDetail?.team ?: listOf()){
                TeamMemberListItem(name = it.name, position = it.position )
            }
        }

    }

}