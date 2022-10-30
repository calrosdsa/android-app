package com.teclu.soporte.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "caso"
)
data class CasoEntity(
    @PrimaryKey(autoGenerate = true)
    override val idEntity:Long =0,
    @ColumnInfo(name = "id") val idCaso: Int,
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
