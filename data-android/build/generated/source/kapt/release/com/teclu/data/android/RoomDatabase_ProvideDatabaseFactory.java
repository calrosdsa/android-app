package com.teclu.data.android;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomDatabase_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> contextProvider;

  public RoomDatabase_ProvideDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(contextProvider.get());
  }

  public static RoomDatabase_ProvideDatabaseFactory create(Provider<Context> contextProvider) {
    return new RoomDatabase_ProvideDatabaseFactory(contextProvider);
  }

  public static AppDatabase provideDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(RoomDatabase.INSTANCE.provideDatabase(context));
  }
}
