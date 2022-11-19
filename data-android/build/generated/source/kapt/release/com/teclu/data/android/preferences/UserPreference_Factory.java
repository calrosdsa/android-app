package com.teclu.data.android.preferences;

import androidx.datastore.core.DataStore;
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
public final class UserPreference_Factory implements Factory<UserPreference> {
  private final Provider<DataStore<UserObject>> userDataStoreProvider;

  public UserPreference_Factory(Provider<DataStore<UserObject>> userDataStoreProvider) {
    this.userDataStoreProvider = userDataStoreProvider;
  }

  @Override
  public UserPreference get() {
    return newInstance(userDataStoreProvider.get());
  }

  public static UserPreference_Factory create(
      Provider<DataStore<UserObject>> userDataStoreProvider) {
    return new UserPreference_Factory(userDataStoreProvider);
  }

  public static UserPreference newInstance(DataStore<UserObject> userDataStore) {
    return new UserPreference(userDataStore);
  }
}
