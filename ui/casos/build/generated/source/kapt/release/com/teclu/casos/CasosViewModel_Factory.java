package com.teclu.casos;

import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.domain.interactors.UpdateImages;
import com.teclu.domain.observers.ObserveCasos;
import com.teclu.domain.observers.ObserverImages;
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
public final class CasosViewModel_Factory implements Factory<CasosViewModel> {
  private final Provider<ObserveCasos> observeCasosProvider;

  private final Provider<ObserverImages> observerImagesProvider;

  private final Provider<UpdateImages> updateImagesProvider;

  private final Provider<UpdateCasos> updateCasosProvider;

  public CasosViewModel_Factory(Provider<ObserveCasos> observeCasosProvider,
      Provider<ObserverImages> observerImagesProvider, Provider<UpdateImages> updateImagesProvider,
      Provider<UpdateCasos> updateCasosProvider) {
    this.observeCasosProvider = observeCasosProvider;
    this.observerImagesProvider = observerImagesProvider;
    this.updateImagesProvider = updateImagesProvider;
    this.updateCasosProvider = updateCasosProvider;
  }

  @Override
  public CasosViewModel get() {
    return newInstance(observeCasosProvider.get(), observerImagesProvider.get(), updateImagesProvider.get(), updateCasosProvider.get());
  }

  public static CasosViewModel_Factory create(Provider<ObserveCasos> observeCasosProvider,
      Provider<ObserverImages> observerImagesProvider, Provider<UpdateImages> updateImagesProvider,
      Provider<UpdateCasos> updateCasosProvider) {
    return new CasosViewModel_Factory(observeCasosProvider, observerImagesProvider, updateImagesProvider, updateCasosProvider);
  }

  public static CasosViewModel newInstance(ObserveCasos observeCasos, ObserverImages observerImages,
      UpdateImages updateImages, UpdateCasos updateCasos) {
    return new CasosViewModel(observeCasos, observerImages, updateImages, updateCasos);
  }
}
