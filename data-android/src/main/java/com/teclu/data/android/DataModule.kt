package com.teclu.data.android

import android.app.Application
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import com.google.crypto.tink.Aead
import com.google.crypto.tink.KeyTemplates
import com.google.crypto.tink.aead.AeadConfig
import com.google.crypto.tink.aead.AesGcmKeyManager
import com.google.crypto.tink.integration.android.AndroidKeysetManager
import com.teclu.domain.preferences.UserObject
import com.teclu.domain.preferences.UserObjectSerializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
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