package com.teclu.data.android.repositories

import android.content.Context
import android.util.Log
import com.dropbox.android.external.store4.Fetcher
import com.dropbox.android.external.store4.SourceOfTruth
import com.dropbox.android.external.store4.Store
import com.dropbox.android.external.store4.StoreBuilder
import com.teclu.data.android.mapper.toImagesEntity
import com.teclu.interfaces.AppTasks
import com.teclu.interfaces.AppUtil
import com.teclu.soporte.daos.CasoEntryDao
import com.teclu.soporte.daos.CasosDao
import com.teclu.soporte.daos.FilterParams
import com.teclu.soporte.daos.ImageDao
import com.teclu.soporte.entities.CasosEntries
import com.teclu.soporte.entities.ImageEntity
import com.teclu.soporte.repositories.ApiService
import com.teclu.util.AppCoroutineDispatchers
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import javax.inject.Singleton
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime


typealias ImageStore = Store<Int, List<ImageEntity>>


@InstallIn(SingletonComponent::class)
@Module
internal object ImagesStoreModule {
    @Singleton
    @Provides
    fun provideImageStore(
        apiService: ApiService,
        imageDao: ImageDao,
//        appUtil: AppUtil,
//        @ApplicationContext context: Context,
//        appCoroutineDispatchers: AppCoroutineDispatchers
        appTasks: AppTasks
    ) :ImageStore = StoreBuilder.from(
        fetcher = Fetcher.of {
//            appTasks.updateImages()
            apiService.getPhotos().also {
                Log.d("DEBUG_D","getting")
            }
        },
        sourceOfTruth = SourceOfTruth.of(
            reader = {_->
                imageDao.getImages().map {entries->
                    when {
                        entries.isEmpty() -> null
                        else -> entries
                    }
                }
            },
            writer ={ _, response ->
//                val sizeRes = response.size/500
                val results = response.map { it.toImagesEntity() }
                imageDao.insertAll(results)
                appTasks.updateImages()


//        Log.d("DEBUG_DD",sizeRes.toString())
//        runBlocking<Unit>(appCoroutineDispatchers.io) {
//                it.toImagesEntity().copy(
//                    thumbnailUrl = appUtil.getImageBitmap(context,it.thumbnailUrl,this@runBlocking)
//
//                )

//        val first = async {
//            response.subList(0,sizeRes).map {
//                Log.d("DEBUG_DD",it.toString())
//                imageDao.insert(
//                    ImageEntity(
//                        id= it.id,
//                        title = it.title,
//                        thumbnailUrl = appUtil.getImageBitmap(context,it.thumbnailUrl)
//                    )
//                )
////                it.toImagesEntity().copy(
////                    thumbnailUrl = appUtil.getImageBitmap(context,it.thumbnailUrl,this@runBlocking)
////
////                )
//            }
//        }
//        val second = async {
//            response.subList(sizeRes, sizeRes * 2).map {
//                it.toImagesEntity().copy(
//                    thumbnailUrl = appUtil.getImageBitmap(context, it.thumbnailUrl)
//                )
//            }
//        }
//                val therd =async {
//                    response.subList(sizeRes*2, sizeRes*3).map {
//                        it.toImagesEntity().copy(
//                            thumbnailUrl = appUtil.getImageBitmap(context, it.thumbnailUrl)
//                        )
//                    }
//                }
//                val four =async {
//                    response.subList(sizeRes*3,sizeRes*4).map {
//                        it.toImagesEntity().copy(
//                            thumbnailUrl = appUtil.getImageBitmap(context, it.thumbnailUrl)
//                        )
//                    }
//                }
//                val five =async {
//                   response.subList(sizeRes*4,sizeRes*5).map {
//
//                        it.toImagesEntity().copy(
//                            thumbnailUrl = appUtil.getImageBitmap(context, it.thumbnailUrl)
//                        )
//                    }
//
//                }
//            imageDao.insertAll(first.await())
//            Log.d("DEBUG_DD","First ${first.await().size}")
//            Log.d("DEBUG_DD","Second ${second.await().size}")
//                Log.d("DEBUG_DD","Therd ${therd.await().size}")
//                Log.d("DEBUG_DD","Four ${four.await().size}")
//                Log.d("DEBUG_DD",five.await().size.toString())
//        }
//              val entries =  response.map {
//                   it.toImagesEntity()
////                   Log.d("DEBUG_D", it.toString())
////                   imageDao.insert(
////                   ImageEntity(
////                       id = it.id,
////                       title = it.title,
////                       thumbnailUrl = appUtil.getImageBitmap(context,it.thumbnailUrl)
////                   )
//
////                   it.toImagesEntity().copy(
////                   thumbnailUrl = appUtil.getImageBitmap(context,it.thumbnailUrl)
//
////                   )
//               }
//                imageDao.insertAll(entries)
            },
            delete = imageDao::deleteById,
            deleteAll = imageDao::deleteAll
        )
    ).build()
}