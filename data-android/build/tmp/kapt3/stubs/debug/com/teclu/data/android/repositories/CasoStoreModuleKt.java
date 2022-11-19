package com.teclu.data.android.repositories;

import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.dropbox.android.external.store4.Store;
import com.dropbox.android.external.store4.StoreBuilder;
import com.teclu.soporte.daos.CasoEntryDao;
import com.teclu.soporte.daos.CasosDao;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.soporte.entities.CasosEntries;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.flow.*;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*.\u0010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001\u00a8\u0006\u0005"}, d2 = {"CasoStore", "Lcom/dropbox/android/external/store4/Store;", "Lcom/teclu/soporte/daos/FilterParams;", "", "Lcom/teclu/soporte/entities/CasosEntries;", "data-android_debug"})
public final class CasoStoreModuleKt {
}