package com.teclu.soporte.repositories

import com.teclu.soporte.dto.auth.LoginRequest
import com.teclu.soporte.dto.auth.LoginResponse
import com.teclu.soporte.dto.casos.AllCasosItem
import com.teclu.soporte.dto.placeholder.PostUser
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
//    @GET("/caso/all-casos")
//    suspend fun getCasos():List<AllCasosItem>
    @GET("/posts")
    suspend fun getPosts():List<PostUser>

    @POST("/auth/login/")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    @GET("/caso/caso-user")
    suspend fun getCasos():List
}
