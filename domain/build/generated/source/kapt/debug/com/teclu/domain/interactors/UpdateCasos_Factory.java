package com.teclu.domain.interactors;

import androidx.datastore.core.DataStore;
import com.dropbox.android.external.store4.Store;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.soporte.entities.CasosEntries;
import com.teclu.util.AppCoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpdateCasos_Factory implements Factory<UpdateCasos> {
  private final Provider<AppCoroutineDispatchers> dispatchersProvider;

  private final Provider<Store<FilterParams, List<CasosEntries>>> casoStoreProvider;

  private final Provider<DataStore<UserObject>> userDataStoreProvider;

  public UpdateCasos_Factory(Provider<AppCoroutineDispatchers> dispatchersProvider,
      Provider<Store<FilterParams, List<CasosEntries>>> casoStoreProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider) {
    this.dispatchersProvider = dispatchersProvider;
    this.casoStoreProvider = casoStoreProvider;
    this.userDataStoreProvider = userDataStoreProvider;
  }

  @Override
  public UpdateCasos get() {
    return newInstance(dispatchersProvider.get(), casoStoreProvider.get(), userDataStoreProvider.get());
  }

  public static UpdateCasos_Factory create(Provider<AppCoroutineDispatchers> dispatchersProvider,
      Provider<Store<FilterParams, List<CasosEntries>>> casoStoreProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider) {
    return new UpdateCasos_Factory(dispatchersProvider, casoStoreProvider, userDataStoreProvider);
  }

  public static UpdateCasos newInstance(AppCoroutineDispatchers dispatchers,
      Store<FilterParams, List<CasosEntries>> casoStore, DataStore<UserObject> userDataStore) {
    return new UpdateCasos(dispatchers, casoStore, userDataStore);
  }
}
