package com.teclu.soporte.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.teclu.soporte.PaginatedEntry

@Entity(
    tableName = "casos_entry"
)
data class CasosEntries (
    @PrimaryKey(autoGenerate = true) override val id: Long = 0,
    @ColumnInfo(name = "caso_id") override val casoId: Long,
    @ColumnInfo(name = "page") override val page: Int,
    @ColumnInfo(name = "page_order") val pageOrder: Int
        ):PaginatedEntry