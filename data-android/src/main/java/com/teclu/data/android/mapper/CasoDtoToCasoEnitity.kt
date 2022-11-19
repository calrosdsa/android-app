package com.teclu.data.android.mapper

import com.teclu.soporte.dto.casos.Caso
import com.teclu.soporte.entities.CasoEntity
import com.teclu.soporte.mapper.Mapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CasoDtoToCasoEnitity @Inject constructor(
) :Mapper<Caso,CasoEntity>{
    override suspend fun map(from: Caso): CasoEntity = CasoEntity(
        areaCaso = from.areaCaso,
        clienteName = from.clienteName,
        created = from.created,
        descripcion = from.descripcion,
        estado = from.estado,
        fecha_fin = from.fecha_fin,
        fecha_inicio = from.fecha_inicio,
        funcionarioName = from.funcionarioName,
        id = from.id.toLong(),
        prioridad = from.prioridad,
        titulo = from.titulo,
        updated = from.updated
    )
}