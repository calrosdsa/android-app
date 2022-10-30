package com.teclu.domain.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class GetUserRole_Factory implements Factory<GetUserRole> {
  @Override
  public GetUserRole get() {
    return newInstance();
  }

  public static GetUserRole_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GetUserRole newInstance() {
    return new GetUserRole();
  }

  private static final class InstanceHolder {
    private static final GetUserRole_Factory INSTANCE = new GetUserRole_Factory();
  }
}
