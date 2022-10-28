package com.teclu.casos

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teclu.domain.preferences.UserObject
import com.teclu.domain.use_cases.casos.GetAllCasos
import com.teclu.soporte.dto.casos.AllCasosItem
import com.teclu.soporte.dto.placeholder.PostUser
import com.teclu.soporte.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class CasosViewModel @Inject constructor(
    private val getAllCasos: GetAllCasos,
    userDataStore: DataStore<UserObject>
) : ViewModel(){
    private val casos = MutableStateFlow<List<AllCasosItem>>(emptyList())
    private val userData = MutableStateFlow<UserObject>(UserObject())
    private val userDataFlow: Flow<UserObject> by lazy {
        userDataStore.data.catch { e ->
            if (e is IOException) {
                emit(UserObject())
            } else {
                throw e
            }
        }
    }
    val state:StateFlow<CasosState> = combine(
        casos,
        userData
    ){casos,user->
        CasosState(
            casos = casos,
            user = user
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = CasosState()
    )

    init{
        viewModelScope.launch {
        userDataFlow.collect{
            this@CasosViewModel.userData.emit(it)
        }
        }
        getCasos()
    }

    private fun getCasos(){
        viewModelScope.launch {
            getAllCasos().collect { result ->
                when (result) {
                    is Resource.Success ->{
                        result.data?.let {
                            this@CasosViewModel.casos.emit(
                                it
                            )
                        }
                    }
                    else -> {}
                }
            }
        }
    }
}