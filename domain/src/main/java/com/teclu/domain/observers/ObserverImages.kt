package com.teclu.domain.observers

import com.teclu.domain.SubjectInteractor
import com.teclu.soporte.daos.ImageDao
import com.teclu.soporte.entities.ImageEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObserverImages @Inject constructor(
    private val imageDao: ImageDao
) : SubjectInteractor<ObserverImages.Params,List<ImageEntity>>(){
    override fun createObservable(params: Params): Flow<List<ImageEntity>> {
        return imageDao.getImages()
    }


    data class Params(
        val id:Int = 0
    )
}