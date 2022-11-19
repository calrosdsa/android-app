package com.teclu.data.android.preferences;

import android.content.SharedPreferences;
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
public final class AppPreferenceImpl_Factory implements Factory<AppPreferenceImpl> {
  private final Provider<SharedPreferences> preferencesProvider;

  public AppPreferenceImpl_Factory(Provider<SharedPreferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public AppPreferenceImpl get() {
    return newInstance(preferencesProvider.get());
  }

  public static AppPreferenceImpl_Factory create(Provider<SharedPreferences> preferencesProvider) {
    return new AppPreferenceImpl_Factory(preferencesProvider);
  }

  public static AppPreferenceImpl newInstance(SharedPreferences preferences) {
    return new AppPreferenceImpl(preferences);
  }
}
