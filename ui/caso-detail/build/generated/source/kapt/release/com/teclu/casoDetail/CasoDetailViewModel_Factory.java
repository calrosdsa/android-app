package com.teclu.casoDetail;

import androidx.datastore.core.DataStore;
import androidx.lifecycle.SavedStateHandle;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.domain.use_cases.casos.CasoDetailUseCase;
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
public final class CasoDetailViewModel_Factory implements Factory<CasoDetailViewModel> {
  private final Provider<DataStore<UserObject>> userDataStoreProvider;

  private final Provider<CasoDetailUseCase> casoDetailUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public CasoDetailViewModel_Factory(Provider<DataStore<UserObject>> userDataStoreProvider,
      Provider<CasoDetailUseCase> casoDetailUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.userDataStoreProvider = userDataStoreProvider;
    this.casoDetailUseCaseProvider = casoDetailUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public CasoDetailViewModel get() {
    return newInstance(userDataStoreProvider.get(), casoDetailUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static CasoDetailViewModel_Factory create(
      Provider<DataStore<UserObject>> userDataStoreProvider,
      Provider<CasoDetailUseCase> casoDetailUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new CasoDetailViewModel_Factory(userDataStoreProvider, casoDetailUseCaseProvider, savedStateHandleProvider);
  }

  public static CasoDetailViewModel newInstance(DataStore<UserObject> userDataStore,
      CasoDetailUseCase casoDetailUseCase, SavedStateHandle savedStateHandle) {
    return new CasoDetailViewModel(userDataStore, casoDetailUseCase, savedStateHandle);
  }
}
