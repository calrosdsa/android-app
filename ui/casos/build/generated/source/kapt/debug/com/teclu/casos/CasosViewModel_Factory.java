package com.teclu.casos;

import androidx.datastore.core.DataStore;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.data.android.preferences.UserPreference;
import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.domain.observers.ObserveCasos;
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

  private final Provider<ObserveCasos> observeCasosProvider;

  private final Provider<DataStore<UserObject>> userDataStoreProvider;

  private final Provider<UpdateCasos> updateCasosProvider;

  private final Provider<UserPreference> userPreferenceProvider;

  public CasosViewModel_Factory(Provider<GetAllCasos> getAllCasosProvider,
      Provider<ObserveCasos> observeCasosProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider,
      Provider<UpdateCasos> updateCasosProvider, Provider<UserPreference> userPreferenceProvider) {
    this.getAllCasosProvider = getAllCasosProvider;
    this.observeCasosProvider = observeCasosProvider;
    this.userDataStoreProvider = userDataStoreProvider;
    this.updateCasosProvider = updateCasosProvider;
    this.userPreferenceProvider = userPreferenceProvider;
  }

  @Override
  public CasosViewModel get() {
    return newInstance(getAllCasosProvider.get(), observeCasosProvider.get(), userDataStoreProvider.get(), updateCasosProvider.get(), userPreferenceProvider.get());
  }

  public static CasosViewModel_Factory create(Provider<GetAllCasos> getAllCasosProvider,
      Provider<ObserveCasos> observeCasosProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider,
      Provider<UpdateCasos> updateCasosProvider, Provider<UserPreference> userPreferenceProvider) {
    return new CasosViewModel_Factory(getAllCasosProvider, observeCasosProvider, userDataStoreProvider, updateCasosProvider, userPreferenceProvider);
  }

  public static CasosViewModel newInstance(GetAllCasos getAllCasos, ObserveCasos observeCasos,
      DataStore<UserObject> userDataStore, UpdateCasos updateCasos, UserPreference userPreference) {
    return new CasosViewModel(getAllCasos, observeCasos, userDataStore, updateCasos, userPreference);
  }
}
