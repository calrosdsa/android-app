package com.teclu.casos;

import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.data.android.preferences.UserPreference;
import com.teclu.domain.interactors.UpdateCasos;
import com.teclu.domain.observers.ObserveCasos;
import com.teclu.domain.use_cases.casos.GetAllCasos;
import com.teclu.soporte.resultentity.CasosEntryWith;
import com.teclu.util.ObservableLoadingCounter;
import com.teclu.util.UiMessageManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.*;
import java.io.IOException;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020$2\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/teclu/casos/CasosViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllCasos", "Lcom/teclu/domain/use_cases/casos/GetAllCasos;", "observeCasos", "Lcom/teclu/domain/observers/ObserveCasos;", "userDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/teclu/data/android/preferences/UserObject;", "updateCasos", "Lcom/teclu/domain/interactors/UpdateCasos;", "userPreference", "Lcom/teclu/data/android/preferences/UserPreference;", "(Lcom/teclu/domain/use_cases/casos/GetAllCasos;Lcom/teclu/domain/observers/ObserveCasos;Landroidx/datastore/core/DataStore;Lcom/teclu/domain/interactors/UpdateCasos;Lcom/teclu/data/android/preferences/UserPreference;)V", "loadingCouter", "Lcom/teclu/util/ObservableLoadingCounter;", "pagedList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/teclu/soporte/resultentity/CasosEntryWith;", "getPagedList", "()Lkotlinx/coroutines/flow/Flow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/teclu/casos/CasosState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiMessageManager", "Lcom/teclu/util/UiMessageManager;", "userData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "userDataFlow", "getUserDataFlow", "userDataFlow$delegate", "Lkotlin/Lazy;", "clearMessage", "", "id", "", "getCasos", "token", "", "updateDataSource", "Companion", "casos_debug"})
public final class CasosViewModel extends androidx.lifecycle.ViewModel {
    private final com.teclu.domain.use_cases.casos.GetAllCasos getAllCasos = null;
    private final com.teclu.domain.observers.ObserveCasos observeCasos = null;
    private final com.teclu.domain.interactors.UpdateCasos updateCasos = null;
    private final com.teclu.data.android.preferences.UserPreference userPreference = null;
    private final com.teclu.util.ObservableLoadingCounter loadingCouter = null;
    private final com.teclu.util.UiMessageManager uiMessageManager = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.teclu.data.android.preferences.UserObject> userData = null;
    private final kotlin.Lazy userDataFlow$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.teclu.soporte.resultentity.CasosEntryWith>> pagedList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.teclu.casos.CasosState> state = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.casos.CasosViewModel.Companion Companion = null;
    private static final androidx.paging.PagingConfig PAGING_CONFIG = null;
    
    @javax.inject.Inject()
    public CasosViewModel(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.use_cases.casos.GetAllCasos getAllCasos, @org.jetbrains.annotations.NotNull()
    com.teclu.domain.observers.ObserveCasos observeCasos, @org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<com.teclu.data.android.preferences.UserObject> userDataStore, @org.jetbrains.annotations.NotNull()
    com.teclu.domain.interactors.UpdateCasos updateCasos, @org.jetbrains.annotations.NotNull()
    com.teclu.data.android.preferences.UserPreference userPreference) {
        super();
    }
    
    private final kotlinx.coroutines.flow.Flow<com.teclu.data.android.preferences.UserObject> getUserDataFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.teclu.soporte.resultentity.CasosEntryWith>> getPagedList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.teclu.casos.CasosState> getState() {
        return null;
    }
    
    public final void updateDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    private final void getCasos(java.lang.String token) {
    }
    
    public final void clearMessage(long id) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/teclu/casos/CasosViewModel$Companion;", "", "()V", "PAGING_CONFIG", "Landroidx/paging/PagingConfig;", "casos_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}