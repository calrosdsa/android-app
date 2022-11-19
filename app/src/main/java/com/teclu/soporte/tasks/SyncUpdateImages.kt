package com.teclu.soporte.tasks

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.Data
import androidx.work.WorkerParameters
import coil.ImageLoader
import coil.executeBlocking
import coil.request.ImageRequest
import com.teclu.data.android.mapper.toImagesEntity
import com.teclu.domain.interactors.UpdateImages
import com.teclu.interfaces.AppUtil
import com.teclu.soporte.daos.ImageDao
import com.teclu.soporte.entities.ImageEntity
import com.teclu.soporte.repositories.ApiService
import com.teclu.util.AppCoroutineDispatchers
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

@HiltWorker
class SyncUpdateImages @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
//    private val updateImages: UpdateImages,
    private val imageDao: ImageDao,
    private val imageLoader: ImageLoader,
//    private val apiService: ApiService,
    private val updateImages: UpdateImages,
//    private val appUtil: AppUtil,
//    private val dispatchers: AppCoroutineDispatchers
) : CoroutineWorker(context,params) {
    companion object {
        const val TAG = "sync-update-images"
//        private const val PARAM_SHOW_ID = "show-id"
//        fun buildData(images: List<ImageEntity>) = Data.Builder()
//            .putAll(images)
//            .build()
    }

    @SuppressLint("SuspiciousIndentation")
    override suspend fun doWork(): Result {
        try {
            Log.d("DEBUG_D","BEGIN")
            val images = imageDao.getImageList()
            Log.d("DEBUG_D",images.size.toString())
               images.map {
                   Log.d("DEBUG_D",it.id.toString())
                   val request = ImageRequest.Builder(applicationContext)
                       .memoryCacheKey(it.title)
                       .data(it.thumbnailUrl)
                       .build()
                   imageLoader.executeBlocking(request)
               }
            return Result.success()
        }catch(e:Exception){
            Log.d("DEBUG_DD", e.localizedMessage?:"Failed Fatal")
            return Result.failure()
        }
    }
//    fun buildImage(
//        model:Any?,
//        requestBuilder: (ImageRequest.Builder.() -> ImageRequest.Builder)?={crossfade(true)}
//    ){
//        requestBuilder?.let {builder->
//            when(model){
//                is ImageRequest -> model.newBuilder()
//                else -> ImageRequest.Builder(applicationContext).data(model)
//            }.apply { this.builder() }.build()
//        }
//    }

}