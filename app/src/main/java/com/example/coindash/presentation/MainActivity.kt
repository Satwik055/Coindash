package com.example.coindash.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.coindash.presentation.coin_list_screen.CoinListScreen
import com.example.coindash.presentation.detail_screen.CoinDetailScreen
import com.example.coindash.presentation.navigation.SetupNavGraph
import com.example.coindash.presentation.theme.CoindashTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoindashTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoindashTheme {
        CoinListScreen(navController = rememberNavController())
    }
}