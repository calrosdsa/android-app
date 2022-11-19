package com.teclu.data.android;

import android.app.Application;
import com.google.crypto.tink.Aead;
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
public final class DataModule_ProvideAeadFactory implements Factory<Aead> {
  private final DataModule module;

  private final Provider<Application> applicationProvider;

  public DataModule_ProvideAeadFactory(DataModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Aead get() {
    return provideAead(module, applicationProvider.get());
  }

  public static DataModule_ProvideAeadFactory create(DataModule module,
      Provider<Application> applicationProvider) {
    return new DataModule_ProvideAeadFactory(module, applicationProvider);
  }

  public static Aead provideAead(DataModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideAead(application));
  }
}
