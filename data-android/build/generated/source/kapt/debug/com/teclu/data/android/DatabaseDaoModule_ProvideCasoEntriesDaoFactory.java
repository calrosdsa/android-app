package com.teclu.data.android;

import com.teclu.soporte.daos.CasoEntryDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseDaoModule_ProvideCasoEntriesDaoFactory implements Factory<CasoEntryDao> {
  private final Provider<AppDatabase> dbProvider;

  public DatabaseDaoModule_ProvideCasoEntriesDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public CasoEntryDao get() {
    return provideCasoEntriesDao(dbProvider.get());
  }

  public static DatabaseDaoModule_ProvideCasoEntriesDaoFactory create(
      Provider<AppDatabase> dbProvider) {
    return new DatabaseDaoModule_ProvideCasoEntriesDaoFactory(dbProvider);
  }

  public static CasoEntryDao provideCasoEntriesDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseDaoModule.INSTANCE.provideCasoEntriesDao(db));
  }
}
