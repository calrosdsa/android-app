package com.teclu.soporte.tasks;

import android.content.Context;
import android.util.Log;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import com.teclu.domain.interactors.UpdateImages;
import com.teclu.interfaces.AppUtil;
import com.teclu.soporte.daos.ImageDao;
import com.teclu.soporte.entities.ImageEntity;
import com.teclu.soporte.repositories.ApiService;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

@androidx.hilt.work.HiltWorker()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/teclu/soporte/tasks/SyncUpdateData;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "imageDao", "Lcom/teclu/soporte/daos/ImageDao;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/teclu/soporte/daos/ImageDao;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "tasks_debug"})
public final class SyncUpdateData extends androidx.work.CoroutineWorker {
    private final com.teclu.soporte.daos.ImageDao imageDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.soporte.tasks.SyncUpdateData.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "sync-update-data";
    
    @dagger.assisted.AssistedInject()
    public SyncUpdateData(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull()
    com.teclu.soporte.daos.ImageDao imageDao) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/teclu/soporte/tasks/SyncUpdateData$Companion;", "", "()V", "TAG", "", "tasks_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}