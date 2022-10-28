package com.teclu.casos;

import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModel;
import com.teclu.domain.preferences.UserObject;
import com.teclu.domain.use_cases.casos.GetAllCasos;
import com.teclu.soporte.dto.casos.AllCasosItem;
import com.teclu.soporte.dto.placeholder.PostUser;
import com.teclu.soporte.util.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.*;
import java.io.IOException;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/teclu/casos/CasosViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllCasos", "Lcom/teclu/domain/use_cases/casos/GetAllCasos;", "userDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/teclu/domain/preferences/UserObject;", "(Lcom/teclu/domain/use_cases/casos/GetAllCasos;Landroidx/datastore/core/DataStore;)V", "casos", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/teclu/soporte/dto/casos/AllCasosItem;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/teclu/casos/CasosState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "userData", "userDataFlow", "Lkotlinx/coroutines/flow/Flow;", "getUserDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "userDataFlow$delegate", "Lkotlin/Lazy;", "getCasos", "", "casos_debug"})
public final class CasosViewModel extends androidx.lifecycle.ViewModel {
    private final com.teclu.domain.use_cases.casos.GetAllCasos getAllCasos = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.teclu.soporte.dto.casos.AllCasosItem>> casos = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.teclu.domain.preferences.UserObject> userData = null;
    private final kotlin.Lazy userDataFlow$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.teclu.casos.CasosState> state = null;
    
    @javax.inject.Inject()
    public CasosViewModel(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.use_cases.casos.GetAllCasos getAllCasos, @org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<com.teclu.domain.preferences.UserObject> userDataStore) {
        super();
    }
    
    private final kotlinx.coroutines.flow.Flow<com.teclu.domain.preferences.UserObject> getUserDataFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.teclu.casos.CasosState> getState() {
        return null;
    }
    
    private final void getCasos() {
    }
}