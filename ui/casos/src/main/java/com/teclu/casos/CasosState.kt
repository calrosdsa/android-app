package com.teclu.casos

import com.teclu.domain.preferences.UserObject
import com.teclu.soporte.dto.casos.AllCasosItem
import com.teclu.soporte.dto.placeholder.PostUser

data class CasosState (
    val casos:List<AllCasosItem> = emptyList(),
    val loading:Boolean = false,
    val user:UserObject? = null
)
