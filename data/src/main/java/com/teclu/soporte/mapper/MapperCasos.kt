package com.teclu.soporte.mapper

import com.teclu.soporte.dto.casos.Caso
import com.teclu.soporte.entities.CasoEntity

fun Caso.toCasosEntity():CasoEntity{
    return CasoEntity(
        areaCaso = areaCaso,
        clienteName = clienteName,
        created = created,
        descripcion = descripcion,
        estado = estado,
        fecha_fin = fecha_fin,
        fecha_inicio = fecha_inicio,
        funcionarioName = funcionarioName,
        id = id.toLong(),
        prioridad = prioridad,
        titulo = titulo,
        updated = updated
    )
}