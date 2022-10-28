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
public final class GetAllCasos_Factory implements Factory<GetAllCasos> {
  private final Provider<ApiService> apiServiceProvider;

  public GetAllCasos_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public GetAllCasos get() {
    return newInstance(apiServiceProvider.get());
  }

  public static GetAllCasos_Factory create(Provider<ApiService> apiServiceProvider) {
    return new GetAllCasos_Factory(apiServiceProvider);
  }

  public static GetAllCasos newInstance(ApiService apiService) {
    return new GetAllCasos(apiService);
  }
}
