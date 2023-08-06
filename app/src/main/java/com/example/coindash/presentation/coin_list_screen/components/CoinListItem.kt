package com.example.coindash.presentation.coin_list_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coindash.domain.model.Coin
import com.example.coindash.presentation.theme.Gondola
import com.example.coindash.presentation.theme.Gray
import com.example.coindash.presentation.theme.Green
import com.example.coindash.presentation.theme.Manrope
import com.example.coindash.presentation.theme.White


@Composable
fun CoinListItem(
    coin:Coin,
    onItemClick:(Coin)-> Unit,
    modifier:Modifier = Modifier,
){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .clickable {onItemClick(coin)}
                .fillMaxWidth()
                .height(68.dp)
                .background(color = Gondola, shape = RoundedCornerShape(10.dp))
                .padding(10.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = coin.name,
                    color = White,
                    fontFamily = Manrope,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
                Text(
                    text = coin.symbol,
                    color = Gray,
                    fontFamily = Manrope,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
            }
            Text(
                text = if(coin.isActive) "active" else "inactive",
                color = if(coin.isActive) Green else Red,
                fontFamily = Manrope,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
        }

}

val coin = Coin("1", "ETH", "Ethereum", true)
@Preview
@Composable
fun CoinListItemPreview() {

}
