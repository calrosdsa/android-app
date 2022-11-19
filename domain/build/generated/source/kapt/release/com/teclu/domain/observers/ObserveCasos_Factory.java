package com.teclu.domain.observers;

import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.soporte.daos.CasoEntryDao;
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
public final class ObserveCasos_Factory implements Factory<ObserveCasos> {
  private final Provider<UpdateCasos> updateCasosProvider;

  private final Provider<CasoEntryDao> casoEntryDaoProvider;

  public ObserveCasos_Factory(Provider<UpdateCasos> updateCasosProvider,
      Provider<CasoEntryDao> casoEntryDaoProvider) {
    this.updateCasosProvider = updateCasosProvider;
    this.casoEntryDaoProvider = casoEntryDaoProvider;
  }

  @Override
  public ObserveCasos get() {
    return newInstance(updateCasosProvider.get(), casoEntryDaoProvider.get());
  }

  public static ObserveCasos_Factory create(Provider<UpdateCasos> updateCasosProvider,
      Provider<CasoEntryDao> casoEntryDaoProvider) {
    return new ObserveCasos_Factory(updateCasosProvider, casoEntryDaoProvider);
  }

  public static ObserveCasos newInstance(UpdateCasos updateCasos, CasoEntryDao casoEntryDao) {
    return new ObserveCasos(updateCasos, casoEntryDao);
  }
}
