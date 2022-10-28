package com.teclu.data.android;

import android.app.Application;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.teclu.domain.preferences.UserObject;
import com.teclu.domain.preferences.UserObjectSerializer;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.io.File;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/teclu/data/android/DataModule;", "", "()V", "provideAead", "Lcom/google/crypto/tink/Aead;", "application", "Landroid/app/Application;", "provideDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/teclu/domain/preferences/UserObject;", "aead", "Companion", "data-android_debug"})
@dagger.Module()
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.data.android.DataModule.Companion Companion = null;
    private static final java.lang.String KEYSET_NAME = "master_keyset";
    private static final java.lang.String PREFERENCE_FILE = "master_key_preference";
    private static final java.lang.String MASTER_KEY_URI = "android-keystore://master_key";
    private static final java.lang.String DATASTORE_FILE = "user.pb";
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.crypto.tink.Aead provideAead(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.datastore.core.DataStore<com.teclu.domain.preferences.UserObject> provideDataStore(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.google.crypto.tink.Aead aead) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/teclu/data/android/DataModule$Companion;", "", "()V", "DATASTORE_FILE", "", "KEYSET_NAME", "MASTER_KEY_URI", "PREFERENCE_FILE", "data-android_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}