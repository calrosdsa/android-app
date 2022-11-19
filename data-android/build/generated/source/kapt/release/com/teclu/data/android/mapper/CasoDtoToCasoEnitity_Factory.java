package com.teclu.data.android.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class CasoDtoToCasoEnitity_Factory implements Factory<CasoDtoToCasoEnitity> {
  @Override
  public CasoDtoToCasoEnitity get() {
    return newInstance();
  }

  public static CasoDtoToCasoEnitity_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CasoDtoToCasoEnitity newInstance() {
    return new CasoDtoToCasoEnitity();
  }

  private static final class InstanceHolder {
    private static final CasoDtoToCasoEnitity_Factory INSTANCE = new CasoDtoToCasoEnitity_Factory();
  }
}
