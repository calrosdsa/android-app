package com.teclu.domain;

import android.util.Log;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadType;
import androidx.paging.PagingState;
import androidx.paging.RemoteMediator;
import com.teclu.soporte.PaginatedEntry;
import com.teclu.soporte.resultentity.EntryWithCaso;

/**
 * A [RemoteMediator] which works on [PaginatedEntry] entities. [fetch] will be called with the
 * next page to load.
 */
@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00010\u0005B;\u00121\u0010\u0007\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R>\u0010\u0007\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\bX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/teclu/domain/PaginatedEntryRemoteMediator;", "LI", "Lcom/teclu/soporte/resultentity/EntryWithCaso;", "ET", "Lcom/teclu/soporte/PaginatedEntry;", "Landroidx/paging/RemoteMediator;", "", "fetch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "page", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public final class PaginatedEntryRemoteMediator<LI extends com.teclu.soporte.resultentity.EntryWithCaso<ET>, ET extends com.teclu.soporte.PaginatedEntry> extends androidx.paging.RemoteMediator<java.lang.Integer, LI> {
    private final kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> fetch = null;
    
    public PaginatedEntryRemoteMediator(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> fetch) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, LI> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
}