package com.teclu.soporte.dto.casos

data class AllCasosItem(
    val areaCaso: String,
    val clienteName: String,
    val created: String,
    val descripcion: String,
    val estado: Int,
    val fecha_fin: String,
    val fecha_inicio: String,
    val funcionarioName: String,
    val id: Int,
    val prioridad: Int,
    val titulo: String,
    val updated: String
)