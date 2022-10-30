package com.teclu.data.android;

import android.app.Application;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.room.Room;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.data.android.preferences.UserObjectSerializer;
import com.teclu.soporte.AppDaoDatabase;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.io.File;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/teclu/data/android/DatabaseModuleBinds;", "", "()V", "bindAppDatabase", "Lcom/teclu/soporte/AppDaoDatabase;", "db", "Lcom/teclu/data/android/AppDatabase;", "data-android_debug"})
@dagger.Module()
public abstract class DatabaseModuleBinds {
    
    public DatabaseModuleBinds() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.teclu.soporte.AppDaoDatabase bindAppDatabase(@org.jetbrains.annotations.NotNull()
    com.teclu.data.android.AppDatabase db);
}