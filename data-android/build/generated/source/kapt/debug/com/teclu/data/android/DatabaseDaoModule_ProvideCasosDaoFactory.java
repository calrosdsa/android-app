package com.teclu.data.android;

import com.teclu.soporte.daos.CasosDao;
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
public final class DatabaseDaoModule_ProvideCasosDaoFactory implements Factory<CasosDao> {
  private final Provider<AppDatabase> dbProvider;

  public DatabaseDaoModule_ProvideCasosDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public CasosDao get() {
    return provideCasosDao(dbProvider.get());
  }

  public static DatabaseDaoModule_ProvideCasosDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new DatabaseDaoModule_ProvideCasosDaoFactory(dbProvider);
  }

  public static CasosDao provideCasosDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseDaoModule.INSTANCE.provideCasosDao(db));
  }
}
