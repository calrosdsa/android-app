package com.teclu.soporte.daos

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.teclu.soporte.entities.CasoEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class CasosDao : EntityDao<CasoEntity>() {
    @Query("SELECT *  from caso")
    abstract fun getCasosDao():Flow<List<CasoEntity>>
//    @Transaction
//    @Query("SELECT * from caso")
//    abstract fun getCasosPaging():PagingSource<Int,List<CasoEntity>>

    @Query("DELETE FROM caso WHERE titulo = :id")
    abstract suspend fun deleteCaso(id:Int)

    @Query("DELETE FROM caso")
    abstract suspend fun deleteAll()
}

data class FilterParams(
    val token:String,
    val page:Int
)