package com.teclu.soporte

import com.teclu.soporte.daos.CasoEntryDao
import com.teclu.soporte.daos.CasosDao
import com.teclu.soporte.daos.ImageDao

interface AppDaoDatabase {
    fun casosDao():CasosDao
    fun casoEntriesDao():CasoEntryDao
    fun imageDao():ImageDao
}