package com.teclu.soporte

import com.teclu.soporte.daos.CasosDao

interface AppDatabase {
    fun casosDao():CasosDao
}