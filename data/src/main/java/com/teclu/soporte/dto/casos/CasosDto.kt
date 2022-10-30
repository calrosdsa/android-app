package com.teclu.soporte.dto.casos

data class CasosDto(
    val casos: List<Caso> = emptyList(),
    val current: Int = 0,
    val next: String= "",
    val pages_count: Int= 1,
    val previous: Any = "",
    val products_count: Int =1
)