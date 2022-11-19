package com.teclu.soporte.tasks


import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.Data
import androidx.work.WorkerParameters
import com.teclu.domain.interactors.UpdateImages
import com.teclu.interfaces.AppUtil
import com.teclu.soporte.daos.ImageDao
import com.teclu.soporte.entities.ImageEntity
import com.teclu.soporte.repositories.ApiService
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.toList

@HiltWorker
class SyncUpdateData @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
//    private val updateImages: UpdateImages,
//    private val imageDao: ImageDao
//    private val imageDao: ImageDao,
//    private val apiService: ApiService,
//    private val updateImages: UpdateImages,
//    private val appUtil: AppUtil,
) : CoroutineWorker(context,params) {

    companion object {
        const val TAG = "sync-update-data"
//        private const val PARAM_SHOW_ID = "show-id"
//        fun buildData(images: List<ImageEntity>) = Data.Builder()
//            .putAll(images)
//            .build()
    }

    override suspend fun doWork(): Result {
//        updateImages.executeSync(UpdateImages.Params(1))
//        val pps =   imageDao.getImages().toList()
        Log.d("DEBUG_DD","pps.toString()")
//        val response = apiService.getPhotos()
//        Log.d("DEBUG_DD",response.toString())
//
//        val sizeRes = response.size/5
//        Log.d("DEBUG_DD",sizeRes.toString())
//        val first = response.subList(0,sizeRes)
//        Log.d("DEBUG_DD",first.toString())
//        val second = response.subList(sizeRes,sizeRes*2)
//        Log.d("DEBUG_DD",second.toString())
//        val therd = response.subList(sizeRes*2, sizeRes*3)
//        Log.d("DEBUG_DD",therd.toString())
//        val four = response.subList(sizeRes*3,sizeRes*4)
//        Log.d("DEBUG_DD",four.toString())
//        val five = response.subList(sizeRes*4,sizeRes*5)
//        Log.d("DEBUG_DD",five.toString())
//                    Log.d("DEBUG_DD",five.toString())
//            Log.d("DEBUG_DD","UNEXCPECTED")
        return Result.success()
//        val countRes =  response.partition {
//            it.thumbnailUrl.isNotBlank()
//        }
//        updateImages.executeSync(UpdateImages.Params(1))
    }

}