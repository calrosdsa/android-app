package com.teclu.soporte.inject

import com.teclu.soporte.repositories.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(
//        auth:UserAuth
    ): OkHttpClient = with(OkHttpClient.Builder()) {
        writeTimeout(3, TimeUnit.MINUTES)
            .connectTimeout(3, TimeUnit.MINUTES)
            .readTimeout(10L, TimeUnit.MINUTES)
//            .addInterceptor(TokenInterceptor(auth))
        build()
    }

    @Provides
    @Singleton
    fun provideApiService(
        okHttpClient: OkHttpClient,
    ):ApiService{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .baseUrl("https://b13c-138-36-78-236.sa.ngrok.io")
            //    .client(OkHttpClient.Builder()
            //      .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }).build())
            .build()
            .create()
    }

//    @Singleton
//    @Provides
//    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)


}