package com.teclu.soporte

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import com.teclu.soporte.appinitializaer.AppInitializers
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class TecluApplication:Application(), Configuration.Provider {
//    @Inject
//    lateinit var initializers: AppInitializers

    @Inject
    lateinit var workerFactory: HiltWorkerFactory

//    override fun onCreate() {
//        super.onCreate()
//        initializers.init()
//    }

    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
    }
}
