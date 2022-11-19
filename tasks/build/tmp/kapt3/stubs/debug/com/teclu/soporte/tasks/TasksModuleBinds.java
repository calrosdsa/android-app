package com.teclu.soporte.tasks;

import android.content.Context;
import androidx.work.WorkManager;
import com.teclu.interfaces.AppTasks;
import com.teclu.interfaces.AppInitializer;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/teclu/soporte/tasks/TasksModuleBinds;", "", "()V", "provideAppTasks", "Lcom/teclu/interfaces/AppTasks;", "bind", "Lcom/teclu/soporte/tasks/AppTasksImpl;", "provideShowTasksInitializer", "Lcom/teclu/interfaces/AppInitializer;", "Lcom/teclu/soporte/tasks/ShowTasksInitializer;", "tasks_debug"})
@dagger.Module()
public abstract class TasksModuleBinds {
    
    public TasksModuleBinds() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoSet()
    @dagger.Binds()
    public abstract com.teclu.interfaces.AppInitializer provideShowTasksInitializer(@org.jetbrains.annotations.NotNull()
    com.teclu.soporte.tasks.ShowTasksInitializer bind);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.teclu.interfaces.AppTasks provideAppTasks(@org.jetbrains.annotations.NotNull()
    com.teclu.soporte.tasks.AppTasksImpl bind);
}