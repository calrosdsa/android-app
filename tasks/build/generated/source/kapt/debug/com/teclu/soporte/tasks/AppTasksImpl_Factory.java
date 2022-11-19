package com.teclu.soporte.tasks;

import androidx.work.WorkManager;
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
public final class AppTasksImpl_Factory implements Factory<AppTasksImpl> {
  private final Provider<WorkManager> workManagerProvider;

  public AppTasksImpl_Factory(Provider<WorkManager> workManagerProvider) {
    this.workManagerProvider = workManagerProvider;
  }

  @Override
  public AppTasksImpl get() {
    return newInstance(workManagerProvider.get());
  }

  public static AppTasksImpl_Factory create(Provider<WorkManager> workManagerProvider) {
    return new AppTasksImpl_Factory(workManagerProvider);
  }

  public static AppTasksImpl newInstance(WorkManager workManager) {
    return new AppTasksImpl(workManager);
  }
}
