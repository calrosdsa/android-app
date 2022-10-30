package com.teclu.casoDetail

import androidx.datastore.core.DataStore
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teclu.constants.Params
import com.teclu.data.android.preferences.UserObject
import com.teclu.domain.use_cases.casos.CasoDetailUseCase
import com.teclu.soporte.dto.casoDetail.CasoDetailDto
import com.teclu.util.ObservableLoadingCounter
import com.teclu.util.UiMessageManager
import com.teclu.util.collectData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import okio.IOException
import javax.inject.Inject

@HiltViewModel
class CasoDetailViewModel @Inject constructor(
    private val userDataStore: DataStore<UserObject>,
    private val casoDetailUseCase: CasoDetailUseCase,
    savedStateHandle: SavedStateHandle
):ViewModel(){
    private val casoId = savedStateHandle.get<String>(Params.CASO_ID)
    private val casoDetail = MutableStateFlow<CasoDetailDto?>(null)
    private val loadingCounter = ObservableLoadingCounter()
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
    val state:StateFlow<CasoDetailState> = combine(
        loadingCounter.observable,
        uiMessageManager.message,
        userData,
        casoDetail
    ) {loading,message,user,casoDetail->
        CasoDetailState(
            loading = loading,
            message = message,
            user = user,
            casoDetail = casoDetail
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), CasoDetailState())

    init {
        viewModelScope.launch {
            userDataFlow.collect {
                this@CasoDetailViewModel.userData.emit(it)
            }
        }
        getCasoById()
    }

    fun clearMessage(id:Long){
        viewModelScope.launch {
            uiMessageManager.clearMessage(id)
        }
    }

    fun getCasoById(){
        viewModelScope.launch {
            casoDetailUseCase(casoId.toString()).collectData(loadingCounter,uiMessageManager,casoDetail)
        }
    }
}