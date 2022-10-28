package com.teclu.casos;

import androidx.datastore.core.DataStore;
import com.teclu.domain.preferences.UserObject;
import com.teclu.domain.use_cases.casos.GetAllCasos;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class CasosViewModel_Factory implements Factory<CasosViewModel> {
  private final Provider<GetAllCasos> getAllCasosProvider;

  private final Provider<DataStore<UserObject>> userDataStoreProvider;

  public CasosViewModel_Factory(Provider<GetAllCasos> getAllCasosProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider) {
    this.getAllCasosProvider = getAllCasosProvider;
    this.userDataStoreProvider = userDataStoreProvider;
  }

  @Override
  public CasosViewModel get() {
    return newInstance(getAllCasosProvider.get(), userDataStoreProvider.get());
  }

  public static CasosViewModel_Factory create(Provider<GetAllCasos> getAllCasosProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider) {
    return new CasosViewModel_Factory(getAllCasosProvider, userDataStoreProvider);
  }

  public static CasosViewModel newInstance(GetAllCasos getAllCasos,
      DataStore<UserObject> userDataStore) {
    return new CasosViewModel(getAllCasos, userDataStore);
  }
}
