package com.teclu.domain.observers

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.teclu.domain.PaginatedEntryRemoteMediator
import com.teclu.domain.PagingInteractor
import com.teclu.domain.interactors.UpdateCasos
import com.teclu.soporte.daos.CasoEntryDao
import com.teclu.soporte.resultentity.CasosEntryWith
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@OptIn(ExperimentalPagingApi::class)
class ObserveCasos @Inject constructor(
    private val updateCasos: UpdateCasos,
    private val casoEntryDao: CasoEntryDao
) : PagingInteractor<ObserveCasos.Params, CasosEntryWith>(){
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
        override val pagingConfig: PagingConfig,
        val token:String
    ) : Parameters<CasosEntryWith>

}
