package com.teclu.domain.use_cases.auth

import android.annotation.SuppressLint
import androidx.datastore.core.DataStore
import com.teclu.constants.Screen
import com.teclu.data.android.preferences.UserObject
import com.teclu.enums.Roles
import com.teclu.interfaces.AppPreferences
import com.teclu.soporte.dto.auth.LoginRequest
import com.teclu.soporte.repositories.ApiService
import com.teclu.util.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val apiService: ApiService,
    private val userDataStore: DataStore<UserObject>,
    private val appPreferences: AppPreferences
) {
    @SuppressLint("SuspiciousIndentation")
    operator fun invoke (
        email:String,
        password:String
    ) = flow{
        try{
        emit(Resource.Loading())
        val loginRequest = LoginRequest(email,password)
        val response = apiService.login(loginRequest)
            appPreferences.initialScreen = Screen.Casos.route
            val rolUser= when(response.user.role){
                0 -> Roles.CLIENTE
                1 -> Roles.FUNCIONARIO
                2 -> Roles.CLIENTE_ADMIN
                3 -> Roles.FUNCIONARIO_ADMIN
                else -> Roles.CLIENTE
            }
            userDataStore.updateData {user->
                user.copy(
                    username = response.user.username,
                    role = rolUser,
                    id = response.user.pk,
                    token = "Bearer ${response.access_token}",
                )
            }
        emit(Resource.Success(response))
        }catch(e:Exception){
            emit(Resource.Error(e.localizedMessage?:"Ha ocurrido un error inesperado"))
        }

    }
}