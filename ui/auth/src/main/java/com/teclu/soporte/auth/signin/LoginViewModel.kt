package com.teclu.soporte.auth.signin

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.teclu.constants.Screen
import com.teclu.domain.use_cases.auth.LoginUseCase
import com.teclu.soporte.util.Resource
import com.teclu.util.ObservableLoadingCounter
import com.teclu.util.UiMessage
import com.teclu.util.UiMessageManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
):ViewModel() {
    private val loadingCounter = ObservableLoadingCounter()
    private val uiMessageManager = UiMessageManager()
    val state:StateFlow<LoginState> = combine(
        loadingCounter.observable,
        uiMessageManager.message
    ){loading,message->
        LoginState(
        loading = loading,
        message = message
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = LoginState()
    )

    init{
        Log.d("DEBUG","result.toString()")
    }

    fun login(email:String,password:String,
    navController: NavController){
        viewModelScope.launch {
        loginUseCase(email, password).collect{result->
            when(result){
                is Resource.Loading<*> -> {
                    loadingCounter.addLoader()
                }
                is Resource.Success<*> ->{
                    Log.d("DEBUG",result.data.toString())
                    loadingCounter.removeLoader()
                    navController.navigate(Screen.Casos.route)
                }
                is Resource.Error<*> -> {
                    loadingCounter.removeLoader()
//                    Log.d("DEBUG",result.message.toString())
                    result.message?.let {
                        UiMessage(
                            message = it
                        )
                    }?.let { uiMessageManager.emitMessage(it) }
                }
            }
        }
        }
    }

    fun clearMessage(id:Long){
        viewModelScope.launch {
        uiMessageManager.clearMessage(id)
        }
    }
}