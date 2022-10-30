package com.teclu.domain.use_cases.casos

import android.util.Log
import com.teclu.soporte.repositories.ApiService
import com.teclu.util.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetAllCasos @Inject constructor(
    private val apiService: ApiService,
) {

   operator fun invoke(token:String) = flow {
   try{
       Log.d("DEBUGG", token)
       emit(Resource.Loading())
       val response = apiService.getCasos(
           "Bearer $token"
       )
       Log.d("DEBUGG", response.casos.toString())
       emit(Resource.Success(response.casos))
   }catch(e:Exception){
       emit(Resource.Error(e.localizedMessage?:"A ocurrido un error inesperado"))
       Log.d("DEBUGG",e.localizedMessage?:"Error")
   }
   }
}