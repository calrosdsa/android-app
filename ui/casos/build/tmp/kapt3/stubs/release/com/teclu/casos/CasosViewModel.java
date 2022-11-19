package com.teclu.casos;

import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.domain.interactors.UpdateImages;
import com.teclu.domain.observers.ObserveCasos;
import com.teclu.domain.observers.ObserverImages;
import com.teclu.interfaces.AppTasks;
import com.teclu.soporte.daos.ImageDao;
import com.teclu.soporte.resultentity.CasosEntryWith;
import com.teclu.util.ObservableLoadingCounter;
import com.teclu.util.UiMessageManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.*;
import java.io.IOException;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0018J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/teclu/casos/CasosViewModel;", "Landroidx/lifecycle/ViewModel;", "observeCasos", "Lcom/teclu/domain/observers/ObserveCasos;", "observerImages", "Lcom/teclu/domain/observers/ObserverImages;", "updateImages", "Lcom/teclu/domain/interactors/UpdateImages;", "updateCasos", "Lcom/teclu/domain/interactors/UpdateCasos;", "(Lcom/teclu/domain/observers/ObserveCasos;Lcom/teclu/domain/observers/ObserverImages;Lcom/teclu/domain/interactors/UpdateImages;Lcom/teclu/domain/interactors/UpdateCasos;)V", "loadingCouter", "Lcom/teclu/util/ObservableLoadingCounter;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/teclu/casos/CasosState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiMessageManager", "Lcom/teclu/util/UiMessageManager;", "userData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/teclu/data/android/preferences/UserObject;", "clearMessage", "", "id", "", "getCasos", "token", "", "getImages", "updateDataSource", "Companion", "casos_release"})
public final class CasosViewModel extends androidx.lifecycle.ViewModel {
    private final com.teclu.domain.observers.ObserveCasos observeCasos = null;
    private final com.teclu.domain.interactors.UpdateImages updateImages = null;
    private final com.teclu.domain.interactors.UpdateCasos updateCasos = null;
    private final com.teclu.util.ObservableLoadingCounter loadingCouter = null;
    private final com.teclu.util.UiMessageManager uiMessageManager = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.teclu.data.android.preferences.UserObject> userData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.teclu.casos.CasosState> state = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.casos.CasosViewModel.Companion Companion = null;
    private static final androidx.paging.PagingConfig PAGING_CONFIG = null;
    
    @javax.inject.Inject()
    public CasosViewModel(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.observers.ObserveCasos observeCasos, @org.jetbrains.annotations.NotNull()
    com.teclu.domain.observers.ObserverImages observerImages, @org.jetbrains.annotations.NotNull()
    com.teclu.domain.interactors.UpdateImages updateImages, @org.jetbrains.annotations.NotNull()
    com.teclu.domain.interactors.UpdateCasos updateCasos) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.teclu.casos.CasosState> getState() {
        return null;
    }
    
    public final void getImages() {
    }
    
    private final void updateDataSource(java.lang.String token) {
    }
    
    private final void getCasos(java.lang.String token) {
    }
    
    public final void clearMessage(long id) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/teclu/casos/CasosViewModel$Companion;", "", "()V", "PAGING_CONFIG", "Landroidx/paging/PagingConfig;", "casos_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}