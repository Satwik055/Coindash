package com.example.coindash.screens

import com.example.coindash.components.CoinListItem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coindash.ui.theme.Green
import com.example.coindash.ui.theme.Manrope
import com.example.coindash.ui.theme.White
import com.example.coindash.ui.theme.Onyx
import com.example.coindash.utils.DummyData

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            .background(color = Onyx))
    {
        Text(
            "In past 24 hours",
            color = White,
            fontSize = 16.sp,
            fontFamily = Manrope,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row{
            Text(
                "Market is up",
                color = White,
                fontSize = 36.sp,
                fontFamily = Manrope,
                fontWeight = FontWeight.Normal,

                )
            Text(
                "+2%",
                color = Green,
                fontSize = 16.sp,
                fontFamily = Manrope,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(top = 25.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

        }

        Spacer(modifier = Modifier.height(36.dp))
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(DummyData.dummyCoinList()){ coin ->
                CoinListItem(coin = coin)
            }
        }
    }
}


