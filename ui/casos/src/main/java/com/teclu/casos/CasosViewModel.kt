package com.teclu.casos

import androidx.datastore.core.DataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.teclu.data.android.preferences.UserObject
import com.teclu.data.android.preferences.UserPreference
import com.teclu.domain.interactors.UpdateCasos
import com.teclu.domain.observers.ObserveCasos
import com.teclu.domain.use_cases.casos.GetAllCasos
import com.teclu.soporte.resultentity.CasosEntryWith
import com.teclu.util.ObservableLoadingCounter
import com.teclu.util.UiMessageManager
import com.teclu.util.collectStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class CasosViewModel @Inject constructor(
    private val getAllCasos: GetAllCasos,
    private val observeCasos: ObserveCasos,
    userDataStore: DataStore<UserObject>,
    private val updateCasos: UpdateCasos,
    private val userPreference: UserPreference
) : ViewModel(){
    private val loadingCouter = ObservableLoadingCounter()
    private val uiMessageManager = UiMessageManager()
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
    val pagedList:Flow<PagingData<CasosEntryWith>> =observeCasos.flow.cachedIn(viewModelScope)
    val state:StateFlow<CasosState> = combine(
//        observeCasos.flow,
        userData,
        uiMessageManager.message
    ){user,message->
        CasosState(
//            casos = casos,
            user = user,
            message = message
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = CasosState()
    )

    init{
        viewModelScope.launch {
            userPreference.getValue().collect{
//              observeCasos(ObserveCasos.Params(it.token))
                updateDataSource(it.token)
//              getCasos(it.token)
            }
        userDataFlow.collect{
            this@CasosViewModel.userData.emit(it)
        }
        }
    }
    fun updateDataSource(token:String){
        observeCasos(ObserveCasos.Params(PAGING_CONFIG,token))
    }

    private fun getCasos(token:String){
        viewModelScope.launch {
            updateCasos(UpdateCasos.Params(token,1,true)).collectStatus(loadingCouter,uiMessageManager)
//            getAllCasos(userData.value.token).collect { result ->
//                when (result) {
//                    is Resource.Success ->{
//                        result.data?.let {
//                            this@CasosViewModel.casos.emit(
//                                it
//                            )
//                        }
//                    }
//                    else -> {}
//                }
//            }
        }
    }

    fun clearMessage(id:Long){
        viewModelScope.launch {
            uiMessageManager.clearMessage(id)
        }
    }
    companion object {
        private val PAGING_CONFIG = PagingConfig(
            pageSize = 8,
            prefetchDistance = 1,

        )
    }
}