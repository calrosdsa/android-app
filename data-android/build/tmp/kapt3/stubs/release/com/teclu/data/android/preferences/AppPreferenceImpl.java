package com.teclu.data.android.preferences;

import android.content.SharedPreferences;
import com.teclu.constants.Screen;
import com.teclu.interfaces.AppPreferences;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/teclu/data/android/preferences/AppPreferenceImpl;", "Lcom/teclu/interfaces/AppPreferences;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "<set-?>", "", "initialScreen", "getInitialScreen", "()Ljava/lang/String;", "setInitialScreen", "(Ljava/lang/String;)V", "initialScreen$delegate", "Lcom/teclu/data/android/preferences/AppPreferenceImpl$InitialScreenPreferenceDelegate;", "initialScreenStream", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInitialScreenStream", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "InitialScreenPreferenceDelegate", "data-android_release"})
public final class AppPreferenceImpl implements com.teclu.interfaces.AppPreferences {
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> initialScreenStream = null;
    @org.jetbrains.annotations.NotNull()
    private final com.teclu.data.android.preferences.AppPreferenceImpl.InitialScreenPreferenceDelegate initialScreen$delegate = null;
    
    @javax.inject.Inject()
    public AppPreferenceImpl(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getInitialScreenStream() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getInitialScreen() {
        return null;
    }
    
    @java.lang.Override()
    public void setInitialScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002J\'\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/teclu/data/android/preferences/AppPreferenceImpl$InitialScreenPreferenceDelegate;", "Lkotlin/properties/ReadWriteProperty;", "", "", "name", "default", "(Lcom/teclu/data/android/preferences/AppPreferenceImpl;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "data-android_release"})
    public final class InitialScreenPreferenceDelegate implements kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.String> {
        private final java.lang.String name = null;
        
        public InitialScreenPreferenceDelegate(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String p1_772401952) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getValue(@org.jetbrains.annotations.Nullable()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property) {
            return null;
        }
        
        @java.lang.Override()
        public void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
        }
    }
}