package com.teclu.soporte.tasks;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.teclu.interfaces.AppTasks;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/teclu/soporte/tasks/AppTasksImpl;", "Lcom/teclu/interfaces/AppTasks;", "workManager", "Landroidx/work/WorkManager;", "(Landroidx/work/WorkManager;)V", "updateData", "", "updateImages", "tasks_debug"})
public final class AppTasksImpl implements com.teclu.interfaces.AppTasks {
    private final androidx.work.WorkManager workManager = null;
    
    @javax.inject.Inject()
    public AppTasksImpl(@org.jetbrains.annotations.NotNull()
    androidx.work.WorkManager workManager) {
        super();
    }
    
    @java.lang.Override()
    public void updateImages() {
    }
    
    @java.lang.Override()
    public void updateData() {
    }
}