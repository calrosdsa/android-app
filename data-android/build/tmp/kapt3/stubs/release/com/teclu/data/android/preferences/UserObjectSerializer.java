package com.teclu.data.android.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.crypto.tink.Aead;
import com.teclu.constants.Screen;
import com.teclu.enums.Roles;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import java.io.InputStream;
import java.io.OutputStream;

@kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/teclu/data/android/preferences/UserObjectSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/teclu/data/android/preferences/UserObject;", "aead", "Lcom/google/crypto/tink/Aead;", "(Lcom/google/crypto/tink/Aead;)V", "defaultValue", "getDefaultValue", "()Lcom/teclu/data/android/preferences/UserObject;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/teclu/data/android/preferences/UserObject;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data-android_release"})
public final class UserObjectSerializer implements androidx.datastore.core.Serializer<com.teclu.data.android.preferences.UserObject> {
    private final com.google.crypto.tink.Aead aead = null;
    @org.jetbrains.annotations.NotNull()
    private final com.teclu.data.android.preferences.UserObject defaultValue = null;
    
    public UserObjectSerializer(@org.jetbrains.annotations.NotNull()
    com.google.crypto.tink.Aead aead) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object readFrom(@org.jetbrains.annotations.NotNull()
    java.io.InputStream input, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.teclu.data.android.preferences.UserObject> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object writeTo(@org.jetbrains.annotations.NotNull()
    com.teclu.data.android.preferences.UserObject t, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream output, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.teclu.data.android.preferences.UserObject getDefaultValue() {
        return null;
    }
}