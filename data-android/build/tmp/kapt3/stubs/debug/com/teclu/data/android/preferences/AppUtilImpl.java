package com.teclu.data.android.preferences;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.teclu.interfaces.AppUtil;
import com.teclu.util.AppCoroutineDispatchers;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/teclu/data/android/preferences/AppUtilImpl;", "Lcom/teclu/interfaces/AppUtil;", "dispatchers", "Lcom/teclu/util/AppCoroutineDispatchers;", "(Lcom/teclu/util/AppCoroutineDispatchers;)V", "getImageBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "imageUrl", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data-android_debug"})
public final class AppUtilImpl implements com.teclu.interfaces.AppUtil {
    private final com.teclu.util.AppCoroutineDispatchers dispatchers = null;
    
    @javax.inject.Inject()
    public AppUtilImpl(@org.jetbrains.annotations.NotNull()
    com.teclu.util.AppCoroutineDispatchers dispatchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImageBitmap(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return null;
    }
}