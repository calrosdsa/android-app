package com.teclu.domain.use_cases.auth

import android.annotation.SuppressLint
import androidx.datastore.core.DataStore
import com.teclu.domain.preferences.UserObject
import com.teclu.soporte.dto.auth.LoginRequest
import com.teclu.soporte.repositories.ApiService
import com.teclu.soporte.util.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val apiService: ApiService,
    private val userDataStore: DataStore<UserObject>
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
            userDataStore.updateData {user->
                user.copy(
                    username = response.user.username,
                    role = response.user.role,
                    id = response.user.pk,
                    token = response.access_token
                )
            }
        emit(Resource.Success(response))
        }catch(e:Exception){
            emit(Resource.Error(e.localizedMessage?:"Ha ocurrido un error inesperado"))
        }

    }
}