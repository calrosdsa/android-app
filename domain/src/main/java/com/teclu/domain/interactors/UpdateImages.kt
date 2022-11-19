package com.teclu.domain.interactors

import android.util.Log
import com.teclu.data.android.repositories.ImageStore
import com.teclu.domain.Interactor
import com.teclu.interfaces.AppTasks
import com.teclu.soporte.daos.FilterParams
import com.teclu.soporte.fetch
import com.teclu.util.AppCoroutineDispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UpdateImages @Inject constructor(
    private val imageStore: ImageStore,
    private val dispatchers: AppCoroutineDispatchers,
) : Interactor<UpdateImages.Params>() {

    override suspend fun doWork(params: Params) {
//        Log.d("DEBUG_D","REQUESTED")
        withContext(dispatchers.io){
            imageStore.fetch(1,true)
        }
    }

    data class Params(
        val id:Int = 1
    )
}