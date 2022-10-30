package com.teclu.data.android.repositories;

import com.teclu.data.android.mapper.CasoDtoToCasoEnitity;
import com.teclu.soporte.repositories.ApiService;
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
public final class CasosDataSource_Factory implements Factory<CasosDataSource> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CasoDtoToCasoEnitity> casoMapperProvider;

  public CasosDataSource_Factory(Provider<ApiService> apiServiceProvider,
      Provider<CasoDtoToCasoEnitity> casoMapperProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.casoMapperProvider = casoMapperProvider;
  }

  @Override
  public CasosDataSource get() {
    return newInstance(apiServiceProvider.get(), casoMapperProvider.get());
  }

  public static CasosDataSource_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<CasoDtoToCasoEnitity> casoMapperProvider) {
    return new CasosDataSource_Factory(apiServiceProvider, casoMapperProvider);
  }

  public static CasosDataSource newInstance(ApiService apiService,
      CasoDtoToCasoEnitity casoMapper) {
    return new CasosDataSource(apiService, casoMapper);
  }
}
