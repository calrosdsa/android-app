package com.teclu.soporte.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.teclu.soporte.entities.ImageEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ImageDao {
    @Query("SELECT * from image_db")
    fun getImages():Flow<List<ImageEntity>>
    @Query("SELECT * from image_db")
    suspend fun getImageList():List<ImageEntity>
    @Query("DELETE FROM image_db WHERE id  = :id")
    suspend fun  deleteById(id:Int)
    @Query("DELETE FROM image_db")
    suspend fun deleteAll()
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(images:List<ImageEntity>)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(images:ImageEntity)
    @Query("SELECT COUNT(id) FROM IMAGE_DB")
    suspend fun getCountImages():Int
    @Query("UPDATE image_db set isSaved = 1 WHERE id = :id")
    suspend fun updateImagesSaved(id:Int)
}