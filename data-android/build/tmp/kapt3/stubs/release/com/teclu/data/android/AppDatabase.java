package com.teclu.data.android;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.teclu.soporte.AppDaoDatabase;
import com.teclu.soporte.entities.CasoEntity;
import com.teclu.soporte.entities.CasosEntries;
import com.teclu.soporte.entities.ImageEntity;

@androidx.room.TypeConverters(value = {com.teclu.data.android.Converter.class})
@androidx.room.Database(entities = {com.teclu.soporte.entities.CasoEntity.class, com.teclu.soporte.entities.CasosEntries.class, com.teclu.soporte.entities.ImageEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lcom/teclu/data/android/AppDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/teclu/soporte/AppDaoDatabase;", "()V", "Companion", "data-android_release"})
public abstract class AppDatabase extends androidx.room.RoomDatabase implements com.teclu.soporte.AppDaoDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.teclu.data.android.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "app_database";
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/teclu/data/android/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "data-android_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}