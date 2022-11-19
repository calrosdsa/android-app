package com.teclu.domain.interactors;

import com.dropbox.android.external.store4.Store;
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

  public UpdateCasos_Factory(Provider<AppCoroutineDispatchers> dispatchersProvider,
      Provider<Store<FilterParams, List<CasosEntries>>> casoStoreProvider) {
    this.dispatchersProvider = dispatchersProvider;
    this.casoStoreProvider = casoStoreProvider;
  }

  @Override
  public UpdateCasos get() {
    return newInstance(dispatchersProvider.get(), casoStoreProvider.get());
  }

  public static UpdateCasos_Factory create(Provider<AppCoroutineDispatchers> dispatchersProvider,
      Provider<Store<FilterParams, List<CasosEntries>>> casoStoreProvider) {
    return new UpdateCasos_Factory(dispatchersProvider, casoStoreProvider);
  }

  public static UpdateCasos newInstance(AppCoroutineDispatchers dispatchers,
      Store<FilterParams, List<CasosEntries>> casoStore) {
    return new UpdateCasos(dispatchers, casoStore);
  }
}
