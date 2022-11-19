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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/teclu/domain/PagingInteractor;", "P", "Lcom/teclu/domain/PagingInteractor$Parameters;", "T", "", "Lcom/teclu/domain/SubjectInteractor;", "Landroidx/paging/PagingData;", "()V", "Parameters", "domain_release"})
public abstract class PagingInteractor<P extends com.teclu.domain.PagingInteractor.Parameters<T>, T extends java.lang.Object> extends com.teclu.domain.SubjectInteractor<P, androidx.paging.PagingData<T>> {
    
    public PagingInteractor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/teclu/domain/PagingInteractor$Parameters;", "T", "", "pagingConfig", "Landroidx/paging/PagingConfig;", "getPagingConfig", "()Landroidx/paging/PagingConfig;", "domain_release"})
    public static abstract interface Parameters<T extends java.lang.Object> {
        
        @org.jetbrains.annotations.NotNull()
        public abstract androidx.paging.PagingConfig getPagingConfig();
    }
}