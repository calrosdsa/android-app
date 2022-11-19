package com.teclu.data.android.preferences;

import com.teclu.util.AppCoroutineDispatchers;
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
public final class AppUtilImpl_Factory implements Factory<AppUtilImpl> {
  private final Provider<AppCoroutineDispatchers> dispatchersProvider;

  public AppUtilImpl_Factory(Provider<AppCoroutineDispatchers> dispatchersProvider) {
    this.dispatchersProvider = dispatchersProvider;
  }

  @Override
  public AppUtilImpl get() {
    return newInstance(dispatchersProvider.get());
  }

  public static AppUtilImpl_Factory create(Provider<AppCoroutineDispatchers> dispatchersProvider) {
    return new AppUtilImpl_Factory(dispatchersProvider);
  }

  public static AppUtilImpl newInstance(AppCoroutineDispatchers dispatchers) {
    return new AppUtilImpl(dispatchers);
  }
}
