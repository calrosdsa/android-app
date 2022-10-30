package com.teclu.casos

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.teclu.soporte.common.compose.LocalAppDateFormatter
import com.teclu.soporte.common.compose.LocalUtilApp
import com.teclu.soporte.common.compose.ui.*
import com.teclu.soporte.common.compose.ui.components.CasoItem
import com.teclu.soporte.resultentity.CasosEntryWith

@Composable
fun CasosScreen(
    navigateToCasoDetail:(String)->Unit
){
   CasosScreen(
       viewModel = hiltViewModel(),
       navigateToCasoDetail = {navigateToCasoDetail(it)}
   )
}

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun CasosScreen(
   viewModel: CasosViewModel,
   navigateToCasoDetail:(String)->Unit
){
    val pagingItems = viewModel.pagedList.collectAsLazyPagingItems()
    val state by viewModel.state.collectAsStateWithLifecycle()
    CasosScreen(
        state = state,
        pagingItems = pagingItems,
        navigateToCasoDetail = {navigateToCasoDetail(it)}
//        clearMessage = viewModel::clearMessage
    )
}
@Composable
internal fun CasosScreen(
    state:CasosState,
    pagingItems:LazyPagingItems<CasosEntryWith>,
    navigateToCasoDetail:(String)->Unit
//    clearMessage:(id:Long)->Unit
) {
    val scaffoldState = rememberScaffoldState()
//    LaunchedEffect(key1 = true, block = {
//        Log.d("DEBUG",pagingItems.itemCount.toString())
//    })

//    state.message?.let { message ->
//        LaunchedEffect(message) {
//            scaffoldState.snackbarHostState.showSnackbar(message.message)
//            // Notify the view model that the message has been dismissed
//            clearMessage(message.id)
//        }
//    }


    pagingItems.loadState.prependErrorOrNull()?.let { message ->
        LaunchedEffect(message) {
            scaffoldState.snackbarHostState.showSnackbar(message.message)
        }
    }
    pagingItems.loadState.appendErrorOrNull()?.let { message ->
        LaunchedEffect(message) {
            scaffoldState.snackbarHostState.showSnackbar(message.message)
        }
    }
    pagingItems.loadState.refreshErrorOrNull()?.let { message ->
        LaunchedEffect(message) {
            scaffoldState.snackbarHostState.showSnackbar(message.message)
        }
    }

    Scaffold(
        scaffoldState = scaffoldState,
        snackbarHost = { snackbarHostState ->
            SwipeDismissSnackbarHost(
                hostState = snackbarHostState,
                modifier = Modifier
                    .padding(horizontal = Layout.bodyMargin)
                    .fillMaxWidth()
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(
            modifier = Modifier
//                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(padding)
        ) {
//            state.user?.let {
//                Text(text = it.token)
//            }
            val appUtil = LocalUtilApp.current
            LazyColumn(
            ) {
                items(
                    items = pagingItems,
//                    key = {it.relations}
                ) {item->
                    if (item != null) {
                        state.user?.let { it1 ->
                            CasoItem(
                                caso = item.caso,
                                rol = it1.role,
                                getEstado = {estado,rol->
                                    appUtil.getNameForStateCaso(estado,rol)
                                },
                                getPrioridad = {appUtil.getCasoPrioridad(it)},
                                navigateToCasoDetail = {navigateToCasoDetail(it)}
                            )
                        }
                    }
                    Divider(color = MaterialTheme.colorScheme.onPrimary)
                }
            }
        }
    }
}