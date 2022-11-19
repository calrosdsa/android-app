package com.teclu.data.android;

import android.app.Application;
import androidx.datastore.core.DataStore;
import com.google.crypto.tink.Aead;
import com.teclu.data.android.preferences.UserObject;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DataModule_ProvideDataStoreFactory implements Factory<DataStore<UserObject>> {
  private final DataModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<Aead> aeadProvider;

  public DataModule_ProvideDataStoreFactory(DataModule module,
      Provider<Application> applicationProvider, Provider<Aead> aeadProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.aeadProvider = aeadProvider;
  }

  @Override
  public DataStore<UserObject> get() {
    return provideDataStore(module, applicationProvider.get(), aeadProvider.get());
  }

  public static DataModule_ProvideDataStoreFactory create(DataModule module,
      Provider<Application> applicationProvider, Provider<Aead> aeadProvider) {
    return new DataModule_ProvideDataStoreFactory(module, applicationProvider, aeadProvider);
  }

  public static DataStore<UserObject> provideDataStore(DataModule instance, Application application,
      Aead aead) {
    return Preconditions.checkNotNullFromProvides(instance.provideDataStore(application, aead));
  }
}
