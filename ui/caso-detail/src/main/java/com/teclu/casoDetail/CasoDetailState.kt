package com.teclu.casoDetail

import com.teclu.data.android.preferences.UserObject
import com.teclu.soporte.dto.casoDetail.CasoDetailDto
import com.teclu.util.UiMessage

data class CasoDetailState(
    val loading:Boolean = false,
    val message: UiMessage? = null,
    val user:UserObject? = null,
    val casoDetail:CasoDetailDto? = null
)
