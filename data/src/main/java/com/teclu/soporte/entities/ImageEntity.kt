package com.teclu.soporte.entities

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
    tableName = "image_db"
)
data class ImageEntity (
    @PrimaryKey val id:Int,
    val title:String,
    val url:Bitmap? = null,
    val thumbnailUrl:String = "",
    val isSaved:Boolean = false
        )