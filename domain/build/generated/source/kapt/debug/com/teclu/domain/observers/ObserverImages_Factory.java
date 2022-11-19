package com.teclu.domain.observers;

import com.teclu.soporte.daos.ImageDao;
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
public final class ObserverImages_Factory implements Factory<ObserverImages> {
  private final Provider<ImageDao> imageDaoProvider;

  public ObserverImages_Factory(Provider<ImageDao> imageDaoProvider) {
    this.imageDaoProvider = imageDaoProvider;
  }

  @Override
  public ObserverImages get() {
    return newInstance(imageDaoProvider.get());
  }

  public static ObserverImages_Factory create(Provider<ImageDao> imageDaoProvider) {
    return new ObserverImages_Factory(imageDaoProvider);
  }

  public static ObserverImages newInstance(ImageDao imageDao) {
    return new ObserverImages(imageDao);
  }
}
