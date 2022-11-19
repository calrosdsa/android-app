package com.teclu.data.android

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.teclu.soporte.AppDaoDatabase
import com.teclu.soporte.entities.CasoEntity
import com.teclu.soporte.entities.CasosEntries
import com.teclu.soporte.entities.ImageEntity

@Database(
    entities = [
        CasoEntity::class,
        CasosEntries::class,
        ImageEntity::class
    ],
    version = 1,
//    autoMigrations = [
//        AutoMigration(from = 1, to = 2),
//    ]
)
@TypeConverters(Converter::class)
abstract class AppDatabase:RoomDatabase(), AppDaoDatabase{
    companion object{
        const val DATABASE_NAME = "app_database"
    }
}