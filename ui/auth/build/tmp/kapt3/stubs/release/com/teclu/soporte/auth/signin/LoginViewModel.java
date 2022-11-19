package com.teclu.soporte.auth.signin;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.teclu.constants.Screen;
import com.teclu.domain.use_cases.auth.LoginUseCase;
import com.teclu.util.Resource;
import com.teclu.util.ObservableLoadingCounter;
import com.teclu.util.UiMessageManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/teclu/soporte/auth/signin/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUseCase", "Lcom/teclu/domain/use_cases/auth/LoginUseCase;", "(Lcom/teclu/domain/use_cases/auth/LoginUseCase;)V", "loadingCounter", "Lcom/teclu/util/ObservableLoadingCounter;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/teclu/soporte/auth/signin/LoginState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiMessageManager", "Lcom/teclu/util/UiMessageManager;", "clearMessage", "", "id", "", "login", "email", "", "password", "navController", "Landroidx/navigation/NavController;", "auth_release"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.teclu.domain.use_cases.auth.LoginUseCase loginUseCase = null;
    private final com.teclu.util.ObservableLoadingCounter loadingCounter = null;
    private final com.teclu.util.UiMessageManager uiMessageManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.teclu.soporte.auth.signin.LoginState> state = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.teclu.domain.use_cases.auth.LoginUseCase loginUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.teclu.soporte.auth.signin.LoginState> getState() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    public final void clearMessage(long id) {
    }
}