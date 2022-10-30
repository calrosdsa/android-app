package com.teclu.soporte.repositories

import com.teclu.soporte.dto.auth.LoginRequest
import com.teclu.soporte.dto.auth.LoginResponse
import com.teclu.soporte.dto.casoDetail.CasoDetailDto
import com.teclu.soporte.dto.casos.CasosDto
import com.teclu.soporte.dto.placeholder.PostUser
import retrofit2.http.*

interface ApiService {
//    @GET("/caso/all-casos")
//    suspend fun getCasos():List<AllCasosItem>
    @GET("/posts")
    suspend fun getPosts():List<PostUser>

    @POST("/auth/login/")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    @GET("/caso/caso-user")
    suspend fun getCasos(
        @Header("Authorization") token: String,
        @Query("page") page:Int? = null,
        @Query("ordering") ordering:String? = null,
        @Query("prioridad") prioridad:String? = null,
        @Query("estado") estado:String? = null
    ):CasosDto

    @GET("/caso/caso-admin/")
    suspend fun getCasosAdmin(
        @Header("Authorization") token: String,
        @Path("all") all:String,
        @Query("page") page:Int?= null,
        @Query("ordering") ordering:String? = null,
        @Query("prioridad") prioridad:String? = null,
        @Query("estado") estado:String? = null
    ):CasosDto

    @GET("/caso/detail/{casoId}/")
    suspend fun getCasoById(
        @Path("casoId") casoId:String
    ):CasoDetailDto
}
