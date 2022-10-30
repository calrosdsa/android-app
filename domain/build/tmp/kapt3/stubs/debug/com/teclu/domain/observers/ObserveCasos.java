package com.teclu.domain.observers;

import androidx.paging.ExperimentalPagingApi;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.dropbox.android.external.store4.StoreRequest;
import com.dropbox.android.external.store4.StoreResponse;
import com.teclu.data.android.repositories.CasoStore;
import com.teclu.domain.PaginatedEntryRemoteMediator;
import com.teclu.domain.PagingInteractor;
import com.teclu.domain.SubjectInteractor;
import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.soporte.daos.CasoEntryDao;
import com.teclu.soporte.daos.CasosDao;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.soporte.entities.CasoEntity;
import com.teclu.soporte.resultentity.CasosEntryWith;
import com.teclu.util.AppCoroutineDispatchers;
import kotlinx.coroutines.flow.Flow;
import java.security.Policy.Parameters;
import javax.inject.Inject;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/teclu/domain/observers/ObserveCasos;", "Lcom/teclu/domain/PagingInteractor;", "Lcom/teclu/domain/observers/ObserveCasos$Params;", "Lcom/teclu/soporte/resultentity/CasosEntryWith;", "updateCasos", "Lcom/teclu/domain/interactors/UpdateCasos;", "casoEntryDao", "Lcom/teclu/soporte/daos/CasoEntryDao;", "(Lcom/teclu/domain/interactors/UpdateCasos;Lcom/teclu/soporte/daos/CasoEntryDao;)V", "createObservable", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "params", "Params", "domain_debug"})
public final class ObserveCasos extends com.teclu.domain.PagingInteractor<com.teclu.domain.observers.ObserveCasos.Params, com.teclu.soporte.resultentity.CasosEntryWith> {
    private final com.teclu.domain.interactors.UpdateCasos updateCasos = null;
    private final com.teclu.soporte.daos.CasoEntryDao casoEntryDao = null;
    
    @javax.inject.Inject()
    public ObserveCasos(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.interactors.UpdateCasos updateCasos, @org.jetbrains.annotations.NotNull()
    com.teclu.soporte.daos.CasoEntryDao casoEntryDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.teclu.soporte.resultentity.CasosEntryWith>> createObservable(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.observers.ObserveCasos.Params params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/teclu/domain/observers/ObserveCasos$Params;", "Lcom/teclu/domain/PagingInteractor$Parameters;", "Lcom/teclu/soporte/resultentity/CasosEntryWith;", "pagingConfig", "Landroidx/paging/PagingConfig;", "token", "", "(Landroidx/paging/PagingConfig;Ljava/lang/String;)V", "getPagingConfig", "()Landroidx/paging/PagingConfig;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_debug"})
    public static final class Params implements com.teclu.domain.PagingInteractor.Parameters<com.teclu.soporte.resultentity.CasosEntryWith> {
        @org.jetbrains.annotations.NotNull()
        private final androidx.paging.PagingConfig pagingConfig = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String token = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.teclu.domain.observers.ObserveCasos.Params copy(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingConfig pagingConfig, @org.jetbrains.annotations.NotNull()
        java.lang.String token) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingConfig pagingConfig, @org.jetbrains.annotations.NotNull()
        java.lang.String token) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.paging.PagingConfig component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.paging.PagingConfig getPagingConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToken() {
            return null;
        }
    }
}