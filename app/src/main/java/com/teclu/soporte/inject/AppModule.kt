package com.teclu.soporte.inject

import android.content.Context
import android.content.SharedPreferences
import androidx.core.os.ConfigurationCompat
import coil.ImageLoader
import com.teclu.inject.MediumDate
import com.teclu.inject.MediumDateTime
import com.teclu.inject.ShortDate
import com.teclu.inject.ShortTime
import com.teclu.soporte.repositories.ApiService
import com.teclu.util.AppCoroutineDispatchers
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.Locale
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
            .baseUrl("https://jsonplaceholder.typicode.com")
            //    .client(OkHttpClient.Builder()
            //      .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }).build())
            .build()
            .create()
    }
    @Provides
    @Singleton
    fun provideImageLoader(
        @ApplicationContext context: Context
    )= ImageLoader(context)

    @Singleton
    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    fun provideCoroutineDispatchers() = AppCoroutineDispatchers(
        io = Dispatchers.IO,
        computation = Dispatchers.Default,
        main = Dispatchers.Main
    )

    @Singleton
    @Provides
    @MediumDate
    fun provideMediumDateFormatter(
        locale: Locale
    ): DateTimeFormatter {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale)
    }

    @Singleton
    @Provides
    @MediumDateTime
    fun provideDateTimeFormatter(
        locale: Locale
    ): DateTimeFormatter {
        return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(locale)
    }

    @Singleton
    @Provides
    @ShortDate
    fun provideShortDateFormatter(
        locale: Locale
    ): DateTimeFormatter {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale)
    }

    @Singleton
    @Provides
    @ShortTime
    fun provideShortTimeFormatter(
        locale: Locale
    ): DateTimeFormatter {
        return DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale)
    }

    @Provides
    fun provideAppLocale(
        @ApplicationContext context: Context
    ): Locale {
        return ConfigurationCompat.getLocales(context.resources.configuration)
            .get(0) ?: Locale.getDefault()
    }

//    @Singleton
//    @Provides
//    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)


}