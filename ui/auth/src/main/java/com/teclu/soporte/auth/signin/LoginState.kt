package com.teclu.soporte.auth.signin

import com.teclu.util.UiMessage

data class LoginState (
    val loading:Boolean=false,
    val message:UiMessage? = null
)
