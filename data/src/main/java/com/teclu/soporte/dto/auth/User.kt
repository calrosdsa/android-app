package com.teclu.soporte.dto.auth

data class User(
    val pk: String,
    val role: Int,
    val username: String
)

data class UserDto(
    val pk: String,
    val role: Int,
    val token:String,
    val username: String
)

