package com.teclu.data.android.repositories;

import com.dropbox.android.external.store4.Store;
import com.teclu.interfaces.AppTasks;
import com.teclu.soporte.daos.ImageDao;
import com.teclu.soporte.entities.ImageEntity;
import com.teclu.soporte.repositories.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
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
public final class ImagesStoreModule_ProvideImageStoreFactory implements Factory<Store<Integer, List<ImageEntity>>> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<ImageDao> imageDaoProvider;

  private final Provider<AppTasks> appTasksProvider;

  public ImagesStoreModule_ProvideImageStoreFactory(Provider<ApiService> apiServiceProvider,
      Provider<ImageDao> imageDaoProvider, Provider<AppTasks> appTasksProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.imageDaoProvider = imageDaoProvider;
    this.appTasksProvider = appTasksProvider;
  }

  @Override
  public Store<Integer, List<ImageEntity>> get() {
    return provideImageStore(apiServiceProvider.get(), imageDaoProvider.get(), appTasksProvider.get());
  }

  public static ImagesStoreModule_ProvideImageStoreFactory create(
      Provider<ApiService> apiServiceProvider, Provider<ImageDao> imageDaoProvider,
      Provider<AppTasks> appTasksProvider) {
    return new ImagesStoreModule_ProvideImageStoreFactory(apiServiceProvider, imageDaoProvider, appTasksProvider);
  }

  public static Store<Integer, List<ImageEntity>> provideImageStore(ApiService apiService,
      ImageDao imageDao, AppTasks appTasks) {
    return Preconditions.checkNotNullFromProvides(ImagesStoreModule.INSTANCE.provideImageStore(apiService, imageDao, appTasks));
  }
}
