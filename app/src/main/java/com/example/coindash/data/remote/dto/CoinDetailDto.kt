package com.example.coindash.data.remote.dto

import com.example.coindash.domain.model.CoinDetail

data class CoinDetailDto(
    val description: String,
    val developmentStatus: String,
    val firstDataAt: String,
    val hardwareWallet: Boolean,
    val hashAlgorithm: String,
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val lastDataAt: String,
    val links: Links,
    val linksExtended: List<LinksExtended>,
    val logo: String,
    val message: String,
    val name: String,
    val openSource: Boolean,
    val orgStructure: String,
    val proofType: String,
    val rank: Int,
    val startedAt: String,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<TeamMember>,
    val type: String,
    val whitepaper: Whitepaper
)

fun CoinDetailDto.toCoinDetail():CoinDetail{
    return CoinDetail(
        coinId = id,
        symbol= symbol,
        tags  = tags.map { it.name },
        team= team,
        name=name,
        description = description,
        rank = rank,
        isActive = isActive,
    )
}