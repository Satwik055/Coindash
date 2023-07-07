package com.example.coindash.domain.model

import com.example.coindash.data.remote.dto.Tag
import com.example.coindash.data.remote.dto.TeamMember
import com.example.coindash.data.remote.dto.Whitepaper

data class CoinDetail(
    val coinId:String,
    val name:String,
    val description:String,
    val symbol: String,
    val rank:Int,
    val isActive:Boolean,
    val tags: List<String>,
    val team: List<TeamMember>,
)
