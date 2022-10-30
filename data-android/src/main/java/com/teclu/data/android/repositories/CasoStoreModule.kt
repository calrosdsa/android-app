package com.teclu.data.android.repositories

import com.dropbox.android.external.store4.Fetcher
import com.dropbox.android.external.store4.SourceOfTruth
import com.dropbox.android.external.store4.Store
import com.dropbox.android.external.store4.StoreBuilder
import com.teclu.soporte.daos.CasoEntryDao
import com.teclu.soporte.daos.CasosDao
import com.teclu.soporte.daos.FilterParams
import com.teclu.soporte.entities.CasosEntries
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.*
import java.io.IOException
import javax.inject.Singleton


typealias CasoStore = Store<FilterParams, List<CasosEntries>>

@InstallIn(SingletonComponent::class)
@Module
internal object CasoStoreModule {

    @Singleton
    @Provides
    fun provideCasoStore(
        casoEntryDao: CasoEntryDao,
        casosDataSource: CasosDataSource,
        casosDao: CasosDao
        ) :CasoStore = StoreBuilder.from(
        fetcher = Fetcher.of { params->
            casosDataSource.invoke(params.token,params.page)
        },
        sourceOfTruth = SourceOfTruth.of(
            reader = {params->
             casoEntryDao.entriesObservable(params.page).map { entries->
                 when {
                     entries.isEmpty() -> null
                     else -> entries
                 }
             }
            },
            writer ={ params, response->
                casoEntryDao.withTransaction {
                val entries = response.map { (caso,entry)->
                    casosDao.insert(caso)
                    entry.copy(casoId = caso.idCaso.toLong(),page = params.page)
                }
                    if(params.page ==1 ){
                    casoEntryDao.deleteAll()
                    casoEntryDao.insertAll(entries)
                    }else{
                        casoEntryDao.updatePage(params.page,entries)
                    }
                }
            },
            delete ={it:FilterParams->
                    casoEntryDao.deleteCasoEntry(it.page)
            },
            deleteAll = casoEntryDao::deleteAll
        )
    ).build()
}