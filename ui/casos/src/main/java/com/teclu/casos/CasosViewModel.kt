package com.teclu.casos

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.teclu.data.android.preferences.UserObject
import com.teclu.domain.interactors.UpdateCasos
import com.teclu.domain.interactors.UpdateImages
import com.teclu.domain.observers.ObserveCasos
import com.teclu.domain.observers.ObserverImages
import com.teclu.interfaces.AppTasks
import com.teclu.soporte.daos.ImageDao
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
//    private val getAllCasos: GetAllCasos,
//    private val observeCasos: ObserveCasos,
    private val observeCasos: ObserveCasos,
    observerImages: ObserverImages,
    private val updateImages: UpdateImages,
//    private val imageDao: ImageDao,
//    private val appTasks: AppTasks,
//    userDataStore: DataStore<UserObject>,
    private val updateCasos: UpdateCasos,
//    private val userPreference: UserPreference
) : ViewModel(){
    private val loadingCouter = ObservableLoadingCounter()
    private val uiMessageManager = UiMessageManager()
    private val userData = MutableStateFlow<UserObject>(UserObject())
//    private val userDataFlow: Flow<UserObject> by lazy {
//        userDataStore.data.catch { e ->
//            if (e is IOException) {
//                emit(UserObject())
//            } else {
//                throw e
//            }
//        }
//    }
//    val pagedList:Flow<PagingData<CasosEntryWith>> =observeCasos.flow.cachedIn(viewModelScope)
    val state:StateFlow<CasosState> = combine(
//        observeCasos.flow,
        userData,
        uiMessageManager.message,
        observerImages.flow
//        observeCasos.flow
    ){user,message,images->
        CasosState(
//            casos = casos,
            user = user,
            message = message,
            imageList = images
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = CasosState()
    )
    init{
//        viewModelScope.launch {
//            val count = imageDao.getCountImages()
//            Log.d("DEBUG_DD",count.toString())
//        }
//        observeCasos(ObserveCasos.Params("dad") )
        observerImages(ObserverImages.Params(1))
//        appTasks.updateImages()
       getImages()
//        viewModelScope.launch {
//              observeCasos(ObserveCasos.Params(it.token))
//              getCasos(it.token)
//        userDataFlow.collect{
//            updateDataSource(it.token)
//            this@CasosViewModel.userData.emit(it)
//        }
//        }
    }
    fun getImages(){
        viewModelScope.launch {
//            appTasks.updateImages()
            updateImages(UpdateImages.Params(1)).collectStatus(loadingCouter,uiMessageManager)
        }
    }
    private fun updateDataSource(token:String){
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
            pageSize = 20,
            initialLoadSize = 10,
            prefetchDistance = 1,

        )
    }
}