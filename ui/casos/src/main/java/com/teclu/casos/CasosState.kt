package com.teclu.casos

import com.teclu.data.android.preferences.UserObject
import com.teclu.soporte.entities.CasoEntity
import com.teclu.util.UiMessage

data class CasosState (
    val casos:List<CasoEntity> = emptyList(),
    val loading:Boolean = false,
    val user: UserObject? = null,
    val message:UiMessage? = null
)
