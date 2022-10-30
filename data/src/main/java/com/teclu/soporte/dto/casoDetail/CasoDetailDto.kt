package com.teclu.soporte.dto.casoDetail

data class CasoDetailDto(
    val area: String,
    val cliente: String,
    val content: String,
    val created: String,
    val descripcion: String,
    val descripcion_tecnica: String,
    val empresa: String,
    val estado: Int,
    val fecha_fin: String,
    val fecha_inicio: String,
    val funcionario: String,
    val id: Int,
    val plan_de_accion: String,
    val prioridad: Int,
    val titulo: String,
    val updated: String
)