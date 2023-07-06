package com.example.coindash.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coindash.R
import com.example.coindash.model.Coin
import com.example.coindash.ui.theme.Gondola
import com.example.coindash.ui.theme.Gray
import com.example.coindash.ui.theme.Green
import com.example.coindash.ui.theme.Manrope
import com.example.coindash.ui.theme.White

private val coin = Coin("Ethereum", "ETH",9800.00,23.8 )


@Composable
fun CoinListItem(coin: Coin){
        Row(
            horizontalArrangement = Arrangement.spacedBy(14.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            .fillMaxWidth()
            .height(68.dp)
            .background(color = Gondola, shape = RoundedCornerShape(10.dp))
            .padding(10.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.ic_etherium),
                contentDescription = null,
            )

            Box(modifier= Modifier.fillMaxSize()
                
            ) {
                Text(text = coin.name,
                    color = White,
                    modifier = Modifier.align(Alignment.TopStart),
                    fontFamily = Manrope,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
                Text(coin.price.toString() + "$",
                    color = White,
                    modifier = Modifier.align(Alignment.TopEnd),
                    fontFamily = Manrope,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(coin.symbol,
                    color = Gray,
                    modifier = Modifier.align(Alignment.BottomStart),
                    fontFamily = Manrope,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text("+" + coin.changeIn24Hrs.toString() + "%",
                    color = Green,
                    modifier = Modifier.align(Alignment.BottomEnd),
                    fontFamily = Manrope,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
            }
        }

}

@Preview
@Composable
fun CoinListItemPreview() {
    CoinListItem(coin)
}
