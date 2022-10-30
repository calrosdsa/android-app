package com.teclu.data.android.repositories;

import com.dropbox.android.external.store4.Store;
import com.teclu.soporte.daos.CasoEntryDao;
import com.teclu.soporte.daos.CasosDao;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.soporte.entities.CasosEntries;
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
public final class CasoStoreModule_ProvideCasoStoreFactory implements Factory<Store<FilterParams, List<CasosEntries>>> {
  private final Provider<CasoEntryDao> casoEntryDaoProvider;

  private final Provider<CasosDataSource> casosDataSourceProvider;

  private final Provider<CasosDao> casosDaoProvider;

  public CasoStoreModule_ProvideCasoStoreFactory(Provider<CasoEntryDao> casoEntryDaoProvider,
      Provider<CasosDataSource> casosDataSourceProvider, Provider<CasosDao> casosDaoProvider) {
    this.casoEntryDaoProvider = casoEntryDaoProvider;
    this.casosDataSourceProvider = casosDataSourceProvider;
    this.casosDaoProvider = casosDaoProvider;
  }

  @Override
  public Store<FilterParams, List<CasosEntries>> get() {
    return provideCasoStore(casoEntryDaoProvider.get(), casosDataSourceProvider.get(), casosDaoProvider.get());
  }

  public static CasoStoreModule_ProvideCasoStoreFactory create(
      Provider<CasoEntryDao> casoEntryDaoProvider,
      Provider<CasosDataSource> casosDataSourceProvider, Provider<CasosDao> casosDaoProvider) {
    return new CasoStoreModule_ProvideCasoStoreFactory(casoEntryDaoProvider, casosDataSourceProvider, casosDaoProvider);
  }

  public static Store<FilterParams, List<CasosEntries>> provideCasoStore(CasoEntryDao casoEntryDao,
      CasosDataSource casosDataSource, CasosDao casosDao) {
    return Preconditions.checkNotNullFromProvides(CasoStoreModule.INSTANCE.provideCasoStore(casoEntryDao, casosDataSource, casosDao));
  }
}
