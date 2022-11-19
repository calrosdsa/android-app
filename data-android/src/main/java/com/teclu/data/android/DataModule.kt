package com.teclu.data.android

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.room.Room
import com.google.crypto.tink.Aead
import com.google.crypto.tink.KeyTemplates
import com.google.crypto.tink.aead.AeadConfig
import com.google.crypto.tink.integration.android.AndroidKeysetManager
import com.teclu.data.android.preferences.UserObject
import com.teclu.data.android.preferences.UserObjectSerializer
import com.teclu.soporte.AppDaoDatabase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.io.File
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    companion object {
        private const val KEYSET_NAME = "master_keyset"
        private const val PREFERENCE_FILE = "master_key_preference"
        private const val MASTER_KEY_URI = "android-keystore://master_key"

        private const val DATASTORE_FILE = "user.pb"
    }

    @Singleton
    @Provides
    fun provideAead(application: Application): Aead {
        AeadConfig.register()

        return AndroidKeysetManager.Builder()
            .withSharedPref(application, KEYSET_NAME, PREFERENCE_FILE)
            .withKeyTemplate(KeyTemplates.get("AES256_GCM"))
            .withMasterKeyUri(MASTER_KEY_URI)
            .build()
            .keysetHandle
            .getPrimitive(Aead::class.java)
    }

    @Singleton
    @Provides
    fun provideDataStore(application: Application, aead: Aead): DataStore<UserObject> {
        return DataStoreFactory.create(
            produceFile = { File(application.filesDir, "datastore/$DATASTORE_FILE") },
            serializer = UserObjectSerializer(aead)
        )
    }
}

@InstallIn(SingletonComponent::class)
@Module
object RoomDatabase{
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context:Context
    ):AppDatabase{
        val builder = Room.databaseBuilder(context,AppDatabase::class.java,AppDatabase.DATABASE_NAME)
        return builder.build()
    }
}

@InstallIn(SingletonComponent::class)
@Module
object DatabaseDaoModule {
    @Provides
    fun provideCasosDao(db:AppDatabase) = db.casosDao()
    @Provides
    fun provideCasoEntriesDao(db:AppDatabase) = db.casoEntriesDao()
    @Provides
    fun provideImageDao(db:AppDatabase) = db.imageDao()
}

@InstallIn(SingletonComponent::class)
@Module
abstract class DatabaseModuleBinds{
    @Binds
    abstract fun bindAppDatabase(db:AppDatabase):AppDaoDatabase

}

