package com.teclu.domain.use_cases.casos

import com.teclu.soporte.repositories.ApiService
import com.teclu.util.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CasoDetailUseCase @Inject constructor(
    private val apiService: ApiService
) {
    operator fun invoke(casoId:String) = flow{
        try{
            emit(Resource.Loading())
            val response = apiService.getCasoById(casoId)
            emit(Resource.Success(response))
        }catch(e:Exception){
            emit(Resource.Error(e.localizedMessage?:"Error inesperado"))
        }

    }
}