package com.teclu.casoDetail;

import androidx.datastore.core.DataStore;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.teclu.constants.Params;
import com.teclu.data.android.preferences.UserObject;
import com.teclu.domain.use_cases.casos.CasoDetailUseCase;
import com.teclu.soporte.dto.casoDetail.CasoDetailDto;
import com.teclu.util.ObservableLoadingCounter;
import com.teclu.util.UiMessageManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.*;
import okio.IOException;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020 R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/teclu/casoDetail/CasoDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "userDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/teclu/data/android/preferences/UserObject;", "casoDetailUseCase", "Lcom/teclu/domain/use_cases/casos/CasoDetailUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/datastore/core/DataStore;Lcom/teclu/domain/use_cases/casos/CasoDetailUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "casoDetail", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/teclu/soporte/dto/casoDetail/CasoDetailDto;", "casoId", "", "loadingCounter", "Lcom/teclu/util/ObservableLoadingCounter;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/teclu/casoDetail/CasoDetailState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiMessageManager", "Lcom/teclu/util/UiMessageManager;", "userData", "userDataFlow", "Lkotlinx/coroutines/flow/Flow;", "getUserDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "userDataFlow$delegate", "Lkotlin/Lazy;", "clearMessage", "", "id", "", "getCasoById", "caso-detail_release"})
public final class CasoDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.datastore.core.DataStore<com.teclu.data.android.preferences.UserObject> userDataStore = null;
    private final com.teclu.domain.use_cases.casos.CasoDetailUseCase casoDetailUseCase = null;
    private final java.lang.String casoId = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.teclu.soporte.dto.casoDetail.CasoDetailDto> casoDetail = null;
    private final com.teclu.util.ObservableLoadingCounter loadingCounter = null;
    private final com.teclu.util.UiMessageManager uiMessageManager = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.teclu.data.android.preferences.UserObject> userData = null;
    private final kotlin.Lazy userDataFlow$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.teclu.casoDetail.CasoDetailState> state = null;
    
    @javax.inject.Inject()
    public CasoDetailViewModel(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<com.teclu.data.android.preferences.UserObject> userDataStore, @org.jetbrains.annotations.NotNull()
    com.teclu.domain.use_cases.casos.CasoDetailUseCase casoDetailUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    private final kotlinx.coroutines.flow.Flow<com.teclu.data.android.preferences.UserObject> getUserDataFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.teclu.casoDetail.CasoDetailState> getState() {
        return null;
    }
    
    public final void clearMessage(long id) {
    }
    
    public final void getCasoById() {
    }
}