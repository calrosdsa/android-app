package com.teclu.soporte.resultentity

import androidx.room.Embedded
import androidx.room.Relation
import com.teclu.soporte.entities.CasoEntity
import com.teclu.soporte.entities.CasosEntries
import java.util.*

class CasosEntryWith: EntryWithCaso<CasosEntries>{
    @Embedded
    override lateinit var entry: CasosEntries

    @Relation(parentColumn = "caso_id", entityColumn = "idEntity")
    override lateinit var relations: List<CasoEntity>

    override fun equals(other: Any?): Boolean = when {
        other === this -> true
        other is CasosEntryWith -> {
            entry == other.entry && relations == other.relations
        }
        else -> false
    }

    override fun hashCode(): Int = Objects.hash(entry, relations)
}
