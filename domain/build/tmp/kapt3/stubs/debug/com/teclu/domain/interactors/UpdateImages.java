package com.teclu.domain.interactors;

import android.util.Log;
import com.teclu.data.android.repositories.ImageStore;
import com.teclu.domain.Interactor;
import com.teclu.interfaces.AppTasks;
import com.teclu.soporte.daos.FilterParams;
import com.teclu.util.AppCoroutineDispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B-\b\u0007\u0012\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0002`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/teclu/domain/interactors/UpdateImages;", "Lcom/teclu/domain/Interactor;", "Lcom/teclu/domain/interactors/UpdateImages$Params;", "imageStore", "Lcom/dropbox/android/external/store4/Store;", "", "", "Lcom/teclu/soporte/entities/ImageEntity;", "Lcom/teclu/data/android/repositories/ImageStore;", "dispatchers", "Lcom/teclu/util/AppCoroutineDispatchers;", "(Lcom/dropbox/android/external/store4/Store;Lcom/teclu/util/AppCoroutineDispatchers;)V", "doWork", "", "params", "(Lcom/teclu/domain/interactors/UpdateImages$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "domain_debug"})
public final class UpdateImages extends com.teclu.domain.Interactor<com.teclu.domain.interactors.UpdateImages.Params> {
    private final com.dropbox.android.external.store4.Store<java.lang.Integer, java.util.List<com.teclu.soporte.entities.ImageEntity>> imageStore = null;
    private final com.teclu.util.AppCoroutineDispatchers dispatchers = null;
    
    @javax.inject.Inject()
    public UpdateImages(@org.jetbrains.annotations.NotNull()
    com.dropbox.android.external.store4.Store<java.lang.Integer, java.util.List<com.teclu.soporte.entities.ImageEntity>> imageStore, @org.jetbrains.annotations.NotNull()
    com.teclu.util.AppCoroutineDispatchers dispatchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.interactors.UpdateImages.Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/teclu/domain/interactors/UpdateImages$Params;", "", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_debug"})
    public static final class Params {
        private final int id = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.teclu.domain.interactors.UpdateImages.Params copy(int id) {
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
        
        public Params() {
            super();
        }
        
        public Params(int id) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
    }
}