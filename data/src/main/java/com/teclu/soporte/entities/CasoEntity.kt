package com.teclu.soporte.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "caso"
)
data class CasoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") override val id: Long,
    val areaCaso: String,
    val clienteName: String,
    val created: String,
    val descripcion: String,
    val estado: Int,
    val fecha_fin: String,
    val fecha_inicio: String,
    val funcionarioName: String,
    val prioridad: Int,
    val titulo: String,
    val updated: String
):AppEntity
