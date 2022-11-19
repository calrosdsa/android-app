package com.teclu.domain.interactors

import androidx.datastore.core.DataStore
import com.teclu.data.android.preferences.UserObject
import com.teclu.data.android.repositories.CasoStore
import com.teclu.domain.Interactor
import com.teclu.soporte.daos.FilterParams
import com.teclu.soporte.fetch
import com.teclu.util.AppCoroutineDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.withContext
import java.io.IOException
import javax.inject.Inject

class UpdateCasos @Inject constructor(
    private val dispatchers: AppCoroutineDispatchers,
    private val casoStore: CasoStore,
//    private val userDataStore: DataStore<UserObject>,
    ) : Interactor<UpdateCasos.Params>() {

    override suspend fun doWork(params: Params) {
        withContext(dispatchers.io){
        val filterParam = FilterParams(params.token,params.page)
            casoStore.fetch(filterParam,params.forceload)
        }
    }

    data class Params(
        val token:String,
        val page:Int = 1,
        val forceload:Boolean,
    )
}