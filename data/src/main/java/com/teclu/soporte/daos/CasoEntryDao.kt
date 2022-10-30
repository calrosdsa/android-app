package com.teclu.soporte.daos

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.teclu.soporte.entities.CasosEntries
import com.teclu.soporte.resultentity.CasosEntryWith
import kotlinx.coroutines.flow.Flow

@Dao
abstract class CasoEntryDao : PaginatedEntryDao<CasosEntries,CasosEntryWith>(){
    @Transaction
    @Query("SELECT * from casos_entry")
    abstract fun getCasosPaging(): PagingSource<Int,CasosEntryWith>

    @Transaction
    @Query("SELECT * FROM casos_entry WHERE page = :page ORDER BY page_order")
    abstract fun entriesObservable(page: Int): Flow<List<CasosEntries>>

    @Query("DELETE FROM casos_entry")
    abstract override suspend fun deleteAll()

    @Query("DELETE FROM casos_entry WHERE page = :id")
    abstract suspend fun deleteCasoEntry(id:Int)

    @Query("DELETE FROM casos_entry WHERE page = :page")
    abstract override suspend fun deletePage(page: Int)
}