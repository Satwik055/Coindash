package com.example.coindash.presentation.detail_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coindash.presentation.theme.Gray
import com.example.coindash.presentation.theme.Manrope
import com.example.coindash.presentation.theme.White

@Composable
fun TeamMemberListItem(
    name:String,
    position:String
){
    Column(
        horizontalAlignment = Alignment.Start
    ) {

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            color = White,
            fontFamily = Manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = position,
            color = White,
            fontFamily = Manrope,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Divider(color = Gray)
    }
}