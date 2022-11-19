package com.teclu.domain.interactors;

import androidx.datastore.core.DataStore;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.data.android.repositories.CasoStore;
import com.teclu.domain.Interactor;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.util.AppCoroutineDispatchers;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006j\u0002`\n\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006j\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/teclu/domain/interactors/UpdateCasos;", "Lcom/teclu/domain/Interactor;", "Lcom/teclu/domain/interactors/UpdateCasos$Params;", "dispatchers", "Lcom/teclu/util/AppCoroutineDispatchers;", "casoStore", "Lcom/dropbox/android/external/store4/Store;", "Lcom/teclu/soporte/daos/FilterParams;", "", "Lcom/teclu/soporte/entities/CasosEntries;", "Lcom/teclu/data/android/repositories/CasoStore;", "(Lcom/teclu/util/AppCoroutineDispatchers;Lcom/dropbox/android/external/store4/Store;)V", "doWork", "", "params", "(Lcom/teclu/domain/interactors/UpdateCasos$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "domain_debug"})
public final class UpdateCasos extends com.teclu.domain.Interactor<com.teclu.domain.interactors.UpdateCasos.Params> {
    private final com.teclu.util.AppCoroutineDispatchers dispatchers = null;
    private final com.dropbox.android.external.store4.Store<com.teclu.soporte.daos.FilterParams, java.util.List<com.teclu.soporte.entities.CasosEntries>> casoStore = null;
    
    @javax.inject.Inject()
    public UpdateCasos(@org.jetbrains.annotations.NotNull()
    com.teclu.util.AppCoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.dropbox.android.external.store4.Store<com.teclu.soporte.daos.FilterParams, java.util.List<com.teclu.soporte.entities.CasosEntries>> casoStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.interactors.UpdateCasos.Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/teclu/domain/interactors/UpdateCasos$Params;", "", "token", "", "page", "", "forceload", "", "(Ljava/lang/String;IZ)V", "getForceload", "()Z", "getPage", "()I", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "domain_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String token = null;
        private final int page = 0;
        private final boolean forceload = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.teclu.domain.interactors.UpdateCasos.Params copy(@org.jetbrains.annotations.NotNull()
        java.lang.String token, int page, boolean forceload) {
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
        java.lang.String token, int page, boolean forceload) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToken() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getPage() {
            return 0;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getForceload() {
            return false;
        }
    }
}