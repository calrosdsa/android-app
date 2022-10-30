package com.teclu.data.android.preferences;

import androidx.datastore.core.DataStore;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/teclu/data/android/preferences/UserPreference;", "", "userDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/teclu/data/android/preferences/UserObject;", "(Landroidx/datastore/core/DataStore;)V", "getValue", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data-android_debug"})
public final class UserPreference {
    private final androidx.datastore.core.DataStore<com.teclu.data.android.preferences.UserObject> userDataStore = null;
    
    @javax.inject.Inject()
    public UserPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<com.teclu.data.android.preferences.UserObject> userDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getValue(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.teclu.data.android.preferences.UserObject>> continuation) {
        return null;
    }
}