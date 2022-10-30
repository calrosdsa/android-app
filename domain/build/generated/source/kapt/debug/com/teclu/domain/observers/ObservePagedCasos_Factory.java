package com.teclu.domain.observers;

import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.soporte.daos.CasosDao;
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
public final class ObservePagedCasos_Factory implements Factory<ObservePagedCasos> {
  private final Provider<CasosDao> casosDaoProvider;

  private final Provider<UpdateCasos> updateCasosProvider;

  public ObservePagedCasos_Factory(Provider<CasosDao> casosDaoProvider,
      Provider<UpdateCasos> updateCasosProvider) {
    this.casosDaoProvider = casosDaoProvider;
    this.updateCasosProvider = updateCasosProvider;
  }

  @Override
  public ObservePagedCasos get() {
    return newInstance(casosDaoProvider.get(), updateCasosProvider.get());
  }

  public static ObservePagedCasos_Factory create(Provider<CasosDao> casosDaoProvider,
      Provider<UpdateCasos> updateCasosProvider) {
    return new ObservePagedCasos_Factory(casosDaoProvider, updateCasosProvider);
  }

  public static ObservePagedCasos newInstance(CasosDao casosDao, UpdateCasos updateCasos) {
    return new ObservePagedCasos(casosDao, updateCasos);
  }
}
