package com.teclu.domain.use_cases.casos;

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
public final class CasoDetailUseCase_Factory implements Factory<CasoDetailUseCase> {
  private final Provider<ApiService> apiServiceProvider;

  public CasoDetailUseCase_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public CasoDetailUseCase get() {
    return newInstance(apiServiceProvider.get());
  }

  public static CasoDetailUseCase_Factory create(Provider<ApiService> apiServiceProvider) {
    return new CasoDetailUseCase_Factory(apiServiceProvider);
  }

  public static CasoDetailUseCase newInstance(ApiService apiService) {
    return new CasoDetailUseCase(apiService);
  }
}
