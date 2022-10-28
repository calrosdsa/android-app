package com.teclu.soporte.dto.auth

data class LoginResponse(
    val access_token: String,
    val refresh_token: String,
    val user: User
)