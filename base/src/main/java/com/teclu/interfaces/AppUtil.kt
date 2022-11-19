package com.teclu.interfaces

import android.content.Context
import android.graphics.Bitmap
import kotlinx.coroutines.CoroutineScope
import java.time.OffsetDateTime

interface AppUtil {
    suspend fun getImageBitmap(context: Context, imageUrl:String?): Bitmap?
//    suspend fun formatDateOffset():OffsetDateTime
}