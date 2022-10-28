package com.teclu.domain.use_cases.auth;

import android.annotation.SuppressLint;
import androidx.datastore.core.DataStore;
import com.teclu.domain.preferences.UserObject;
import com.teclu.soporte.dto.auth.LoginRequest;
import com.teclu.soporte.repositories.ApiService;
import com.teclu.soporte.util.Resource;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0087\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/teclu/domain/use_cases/auth/LoginUseCase;", "", "apiService", "Lcom/teclu/soporte/repositories/ApiService;", "userDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/teclu/domain/preferences/UserObject;", "(Lcom/teclu/soporte/repositories/ApiService;Landroidx/datastore/core/DataStore;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/teclu/soporte/util/Resource;", "Lcom/teclu/soporte/dto/auth/LoginResponse;", "email", "", "password", "domain_debug"})
public final class LoginUseCase {
    private final com.teclu.soporte.repositories.ApiService apiService = null;
    private final androidx.datastore.core.DataStore<com.teclu.domain.preferences.UserObject> userDataStore = null;
    
    @javax.inject.Inject()
    public LoginUseCase(@org.jetbrains.annotations.NotNull()
    com.teclu.soporte.repositories.ApiService apiService, @org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<com.teclu.domain.preferences.UserObject> userDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    public final kotlinx.coroutines.flow.Flow<com.teclu.soporte.util.Resource<com.teclu.soporte.dto.auth.LoginResponse>> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
}