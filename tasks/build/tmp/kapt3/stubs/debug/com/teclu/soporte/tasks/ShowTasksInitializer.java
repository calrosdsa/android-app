package com.teclu.soporte.tasks;

import com.teclu.interfaces.AppTasks;
import com.teclu.interfaces.AppInitializer;
import dagger.Lazy;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/teclu/soporte/tasks/ShowTasksInitializer;", "Lcom/teclu/interfaces/AppInitializer;", "showTasks", "Ldagger/Lazy;", "Lcom/teclu/interfaces/AppTasks;", "(Ldagger/Lazy;)V", "init", "", "tasks_debug"})
public final class ShowTasksInitializer implements com.teclu.interfaces.AppInitializer {
    private final dagger.Lazy<com.teclu.interfaces.AppTasks> showTasks = null;
    
    @javax.inject.Inject()
    public ShowTasksInitializer(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.teclu.interfaces.AppTasks> showTasks) {
        super();
    }
    
    @java.lang.Override()
    public void init() {
    }
}