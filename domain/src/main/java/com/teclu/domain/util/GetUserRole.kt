package com.teclu.domain.util

import com.teclu.enums.Roles
import com.teclu.enums.Roles.*
import javax.inject.Inject

class GetUserRole @Inject constructor(
) {
    fun getUserRole(rol:Int ):Roles{
        return when(rol){
            0 -> CLIENTE
            1 -> FUNCIONARIO
            2 -> CLIENTE_ADMIN
            3 -> FUNCIONARIO_ADMIN
            else -> CLIENTE
        }
    }
}