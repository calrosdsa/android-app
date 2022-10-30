package com.teclu.soporte

import com.teclu.soporte.daos.CasoEntryDao
import com.teclu.soporte.daos.CasosDao

interface AppDaoDatabase {
    fun casosDao():CasosDao
    fun casoEntriesDao():CasoEntryDao
}