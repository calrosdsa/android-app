package com.teclu.data.android;

import com.teclu.soporte.daos.ImageDao;
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
public final class DatabaseDaoModule_ProvideImageDaoFactory implements Factory<ImageDao> {
  private final Provider<AppDatabase> dbProvider;

  public DatabaseDaoModule_ProvideImageDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ImageDao get() {
    return provideImageDao(dbProvider.get());
  }

  public static DatabaseDaoModule_ProvideImageDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new DatabaseDaoModule_ProvideImageDaoFactory(dbProvider);
  }

  public static ImageDao provideImageDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseDaoModule.INSTANCE.provideImageDao(db));
  }
}
