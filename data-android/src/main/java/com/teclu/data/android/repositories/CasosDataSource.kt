package com.teclu.data.android.repositories

import com.teclu.data.android.mapper.CasoDtoToCasoEnitity
import com.teclu.soporte.dto.casos.Caso
import com.teclu.soporte.entities.CasoEntity
import com.teclu.soporte.entities.CasosEntries
import com.teclu.soporte.mapper.IndexedMapper
import com.teclu.soporte.mapper.pairMapperOf
import com.teclu.soporte.repositories.ApiService
import javax.inject.Inject

class CasosDataSource @Inject constructor(
    private val apiService: ApiService ,
    casoMapper:CasoDtoToCasoEnitity
) {
    private val entryMapper  = IndexedMapper<Caso,CasosEntries> {index,_->
        CasosEntries(casoId = 0, pageOrder = index,page=1)
    }
    private val resultMapper = pairMapperOf(casoMapper,entryMapper)

    suspend operator fun invoke(
        token:String,
        page:Int,
    ):List<Pair<CasoEntity,CasosEntries>>{
        return apiService.getCasos(token,page).let {
            resultMapper.invoke(it.casos)
        }
    }
}