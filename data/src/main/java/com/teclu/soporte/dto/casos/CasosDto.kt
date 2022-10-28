package com.teclu.soporte.dto.casos

data class CasosDto(
    val casos: List<Caso>,
    val current: Int,
    val next: String,
    val pages_count: Int,
    val previous: Any,
    val products_count: Int
)