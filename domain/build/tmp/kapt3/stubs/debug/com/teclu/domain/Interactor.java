package com.teclu.domain;

import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.teclu.base.InvokeError;
import com.teclu.base.InvokeStarted;
import com.teclu.base.InvokeStatus;
import com.teclu.base.InvokeSuccess;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.*;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b&\u0018\u0000 \u000f*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\rH\u0086\u0002\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/teclu/domain/Interactor;", "P", "", "()V", "doWork", "", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeSync", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/teclu/base/InvokeStatus;", "timeoutMs", "", "(Ljava/lang/Object;J)Lkotlinx/coroutines/flow/Flow;", "Companion", "domain_debug"})
public abstract class Interactor<P extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.domain.Interactor.Companion Companion = null;
    private static final long defaultTimeoutMs = 0L;
    
    public Interactor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.teclu.base.InvokeStatus> invoke(P params, long timeoutMs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object executeSync(P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object doWork(P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/teclu/domain/Interactor$Companion;", "", "()V", "defaultTimeoutMs", "", "domain_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}