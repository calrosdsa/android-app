package com.teclu.soporte.tasks;

import com.teclu.interfaces.AppTasks;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
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
public final class ShowTasksInitializer_Factory implements Factory<ShowTasksInitializer> {
  private final Provider<AppTasks> showTasksProvider;

  public ShowTasksInitializer_Factory(Provider<AppTasks> showTasksProvider) {
    this.showTasksProvider = showTasksProvider;
  }

  @Override
  public ShowTasksInitializer get() {
    return newInstance(DoubleCheck.lazy(showTasksProvider));
  }

  public static ShowTasksInitializer_Factory create(Provider<AppTasks> showTasksProvider) {
    return new ShowTasksInitializer_Factory(showTasksProvider);
  }

  public static ShowTasksInitializer newInstance(Lazy<AppTasks> showTasks) {
    return new ShowTasksInitializer(showTasks);
  }
}
