package com.teclu.data.android

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import com.teclu.soporte.AppDaoDatabase
import com.teclu.soporte.entities.CasoEntity
import com.teclu.soporte.entities.CasosEntries

@Database(
    entities = [
        CasoEntity::class,
        CasosEntries::class
    ],
    version = 1,
//    autoMigrations = [
//        AutoMigration(from = 1, to = 2),
//    ]
)
abstract class AppDatabase:RoomDatabase(), AppDaoDatabase{
    companion object{
        const val DATABASE_NAME = "app_database"
    }
}