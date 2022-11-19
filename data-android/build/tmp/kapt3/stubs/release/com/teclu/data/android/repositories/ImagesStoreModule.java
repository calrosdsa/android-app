package com.teclu.data.android.repositories;

import android.content.Context;
import android.util.Log;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.dropbox.android.external.store4.Store;
import com.dropbox.android.external.store4.StoreBuilder;
import com.teclu.interfaces.AppTasks;
import com.teclu.interfaces.AppUtil;
import com.teclu.soporte.daos.CasoEntryDao;
import com.teclu.soporte.daos.CasosDao;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.soporte.daos.ImageDao;
import com.teclu.soporte.entities.CasosEntries;
import com.teclu.soporte.entities.ImageEntity;
import com.teclu.soporte.repositories.ApiService;
import com.teclu.util.AppCoroutineDispatchers;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0002`\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/teclu/data/android/repositories/ImagesStoreModule;", "", "()V", "provideImageStore", "Lcom/dropbox/android/external/store4/Store;", "", "", "Lcom/teclu/soporte/entities/ImageEntity;", "Lcom/teclu/data/android/repositories/ImageStore;", "apiService", "Lcom/teclu/soporte/repositories/ApiService;", "imageDao", "Lcom/teclu/soporte/daos/ImageDao;", "appTasks", "Lcom/teclu/interfaces/AppTasks;", "data-android_release"})
@dagger.Module()
public final class ImagesStoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.data.android.repositories.ImagesStoreModule INSTANCE = null;
    
    private ImagesStoreModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.dropbox.android.external.store4.Store<java.lang.Integer, java.util.List<com.teclu.soporte.entities.ImageEntity>> provideImageStore(@org.jetbrains.annotations.NotNull()
    com.teclu.soporte.repositories.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.teclu.soporte.daos.ImageDao imageDao, @org.jetbrains.annotations.NotNull()
    com.teclu.interfaces.AppTasks appTasks) {
        return null;
    }
}