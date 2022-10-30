package com.teclu.domain.observers

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.dropbox.android.external.store4.StoreRequest
import com.dropbox.android.external.store4.StoreResponse
import com.teclu.data.android.repositories.CasoStore
import com.teclu.domain.PaginatedEntryRemoteMediator
import com.teclu.domain.PagingInteractor
import com.teclu.domain.SubjectInteractor
import com.teclu.domain.interactors.UpdateCasos
import com.teclu.soporte.daos.CasoEntryDao
import com.teclu.soporte.daos.CasosDao
import com.teclu.soporte.daos.FilterParams
import com.teclu.soporte.entities.CasoEntity
import com.teclu.soporte.resultentity.CasosEntryWith
import com.teclu.util.AppCoroutineDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import java.security.Policy.Parameters
import javax.inject.Inject

@OptIn(ExperimentalPagingApi::class)
class ObserveCasos @Inject constructor(
//    private val dispatchers: AppCoroutineDispatchers,
    private val updateCasos: UpdateCasos,
    private val casoEntryDao: CasoEntryDao
): PagingInteractor<ObserveCasos.Params, CasosEntryWith>(){

    override fun createObservable(params: Params): Flow<PagingData<CasosEntryWith>> {
        return Pager(
            config = params.pagingConfig,
            remoteMediator = PaginatedEntryRemoteMediator{page->
//                val paramFilter = FilterParams(params.token, page)
                updateCasos.executeSync(
                    UpdateCasos.Params(params.token,page,true)
                )
            },
            pagingSourceFactory = casoEntryDao::getCasosPaging
        ).flow
    }

    data class Params(
        override val pagingConfig:PagingConfig,
        val token:String
    ) :Parameters<CasosEntryWith>
}
//
//) : SubjectInteractor<ObserveCasos.Params,List<CasoEntity>>(){
//
//    override fun createObservable(params: Params): Flow<List<CasoEntity>> {
////        return casosDao.getCasosDao()
//        val filterParams = FilterParams(params.token,1)
//        return casoStore.stream(StoreRequest.cached(filterParams,refresh = false))
//            .filter { it is StoreResponse.Data }
//            .map { it.requireData() }
//            .flowOn(dispatchers.computation)
//    }
//
//    data class Params(val token:String)
//}