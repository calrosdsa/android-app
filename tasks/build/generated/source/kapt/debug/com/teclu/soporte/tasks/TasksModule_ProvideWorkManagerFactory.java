package com.teclu.soporte.tasks;

import android.content.Context;
import androidx.work.WorkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TasksModule_ProvideWorkManagerFactory implements Factory<WorkManager> {
  private final Provider<Context> contextProvider;

  public TasksModule_ProvideWorkManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public WorkManager get() {
    return provideWorkManager(contextProvider.get());
  }

  public static TasksModule_ProvideWorkManagerFactory create(Provider<Context> contextProvider) {
    return new TasksModule_ProvideWorkManagerFactory(contextProvider);
  }

  public static WorkManager provideWorkManager(Context context) {
    return Preconditions.checkNotNullFromProvides(TasksModule.INSTANCE.provideWorkManager(context));
  }
}
