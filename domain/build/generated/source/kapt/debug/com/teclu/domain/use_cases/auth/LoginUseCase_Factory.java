package com.teclu.domain.use_cases.auth;

import androidx.datastore.core.DataStore;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.interfaces.AppPreferences;
import com.teclu.soporte.repositories.ApiService;
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
public final class LoginUseCase_Factory implements Factory<LoginUseCase> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<DataStore<UserObject>> userDataStoreProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public LoginUseCase_Factory(Provider<ApiService> apiServiceProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.userDataStoreProvider = userDataStoreProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  @Override
  public LoginUseCase get() {
    return newInstance(apiServiceProvider.get(), userDataStoreProvider.get(), appPreferencesProvider.get());
  }

  public static LoginUseCase_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<DataStore<UserObject>> userDataStoreProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    return new LoginUseCase_Factory(apiServiceProvider, userDataStoreProvider, appPreferencesProvider);
  }

  public static LoginUseCase newInstance(ApiService apiService, DataStore<UserObject> userDataStore,
      AppPreferences appPreferences) {
    return new LoginUseCase(apiService, userDataStore, appPreferences);
  }
}
