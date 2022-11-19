package com.teclu.domain.interactors;

import com.dropbox.android.external.store4.Store;
import com.teclu.soporte.entities.ImageEntity;
import com.teclu.util.AppCoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
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
public final class UpdateImages_Factory implements Factory<UpdateImages> {
  private final Provider<Store<Integer, List<ImageEntity>>> imageStoreProvider;

  private final Provider<AppCoroutineDispatchers> dispatchersProvider;

  public UpdateImages_Factory(Provider<Store<Integer, List<ImageEntity>>> imageStoreProvider,
      Provider<AppCoroutineDispatchers> dispatchersProvider) {
    this.imageStoreProvider = imageStoreProvider;
    this.dispatchersProvider = dispatchersProvider;
  }

  @Override
  public UpdateImages get() {
    return newInstance(imageStoreProvider.get(), dispatchersProvider.get());
  }

  public static UpdateImages_Factory create(
      Provider<Store<Integer, List<ImageEntity>>> imageStoreProvider,
      Provider<AppCoroutineDispatchers> dispatchersProvider) {
    return new UpdateImages_Factory(imageStoreProvider, dispatchersProvider);
  }

  public static UpdateImages newInstance(Store<Integer, List<ImageEntity>> imageStore,
      AppCoroutineDispatchers dispatchers) {
    return new UpdateImages(imageStore, dispatchers);
  }
}
