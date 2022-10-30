package com.teclu.util

import com.teclu.enums.Roles
import javax.inject.Inject

class AppUtilProvider @Inject constructor() {

    fun getNameForStateUser(userState:Int):String{
        return when(userState){
            0 -> "Activo"
            1 -> "Inactivo"
            2 -> "Eliminado"
            else -> "Activo"
        }
    }

    fun getNameForStateCaso(casoState:Int,rol:Roles):String{
//        val admin = rol == Roles.CLIENTE_ADMIN || rol == Roles.FUNCIONARIO_ADMIN
        val cliente2 = rol == Roles.CLIENTE_ADMIN || rol == Roles.CLIENTE
//        val funcionario2 = rol == Roles.FUNCIONARIO || rol == Roles.FUNCIONARIO_ADMIN
        return when(casoState){
            0 ->if(rol == Roles.CLIENTE) "Pendiente" else ""
            1 -> if(cliente2) "Esperando respuesta" else  "Por responser"
            2 -> if(cliente2) "Por responder" else  "Esperando respuesta"
            3 -> "Resuelto"
            4 -> "No resuelto"
            else -> "None"
        }
    }

    fun getCasoPrioridad(prioridad:Int):String{
        return when(prioridad){
            0 -> "Prioridad baja"
            1 -> "Prioridad media"
            2 -> "Prioridad alta"
            else -> "None"
        }
    }
}