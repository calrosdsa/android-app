package com.teclu.data.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.room.TypeConverter;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalTime;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.DateTimeFormatter;
import java.io.ByteArrayOutputStream;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0014H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0007J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/teclu/data/android/Converter;", "", "()V", "formatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "fromBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "fromInstant", "", "date", "Lorg/threeten/bp/Instant;", "(Lorg/threeten/bp/Instant;)Ljava/lang/Long;", "fromLocalTime", "", "value", "Lorg/threeten/bp/LocalTime;", "fromOffsetDateTime", "Lorg/threeten/bp/OffsetDateTime;", "fromZoneId", "Lorg/threeten/bp/ZoneId;", "toBitmap", "byteArray", "toInstant", "(Ljava/lang/Long;)Lorg/threeten/bp/Instant;", "toLocalTime", "toOffsetDateTime", "toZoneId", "data-android_release"})
public final class Converter {
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.data.android.Converter INSTANCE = null;
    private static final org.threeten.bp.format.DateTimeFormatter formatter = null;
    
    private Converter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final org.threeten.bp.OffsetDateTime toOffsetDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String fromOffsetDateTime(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final org.threeten.bp.ZoneId toZoneId(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String fromZoneId(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZoneId value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final org.threeten.bp.LocalTime toLocalTime(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String fromLocalTime(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.LocalTime value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final byte[] fromBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull()
    byte[] byteArray) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final org.threeten.bp.Instant toInstant(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.Long fromInstant(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.Instant date) {
        return null;
    }
}