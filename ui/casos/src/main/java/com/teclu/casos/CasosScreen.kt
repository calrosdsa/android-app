package com.teclu.casos

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshIndicator
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.teclu.soporte.common.compose.LocalUtilApp
import com.teclu.soporte.common.compose.ui.*
import com.teclu.soporte.common.compose.ui.components.CasoItem
import com.teclu.soporte.common.compose.ui.components.ImageUserComponent
import com.teclu.soporte.resultentity.CasosEntryWith
import kotlinx.coroutines.launch

@Composable
fun CasosScreen(
//    navigateToCasoDetail:(String)->Unit
){
   CasosScreen(
       viewModel = hiltViewModel(),
//       navigateToCasoDetail = {navigateToCasoDetail(it)}
   )
}

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun CasosScreen(
   viewModel: CasosViewModel,
//   navigateToCasoDetail:(String)->Unit
){
//    val pagingItems = viewModel.pagedList.collectAsLazyPagingItems()
    val state by viewModel.state.collectAsStateWithLifecycle()
    CasosScreen(
        state = state,
//        pagingItems = pagingItems,
//        navigateToCasoDetail = {navigateToCasoDetail(it)}
        clearMessage = viewModel::clearMessage,
        getImages = viewModel::getImages
    )
}
@Composable
internal fun CasosScreen(
    state:CasosState,
//    pagingItems:LazyPagingItems<CasosEntryWith>,
//    navigateToCasoDetail:(String)->Unit
    clearMessage:(id:Long)->Unit,
    getImages:()->Unit
) {
    val scaffoldState = rememberScaffoldState()

    state.message?.let { message ->
        LaunchedEffect(message) {
            scaffoldState.snackbarHostState.showSnackbar(message.message)
            // Notify the view model that the message has been dismissed
            clearMessage(message.id)
        }
    }

//
//    pagingItems.loadState.prependErrorOrNull()?.let { message ->
//        LaunchedEffect(message) {
//            scaffoldState.snackbarHostState.showSnackbar(message.message)
//        }
//    }
//    pagingItems.loadState.appendErrorOrNull()?.let { message ->
//        LaunchedEffect(message) {
//            scaffoldState.snackbarHostState.showSnackbar(message.message)
//        }
//    }
//    pagingItems.loadState.refreshErrorOrNull()?.let { message ->
//        LaunchedEffect(message) {
//            scaffoldState.snackbarHostState.showSnackbar(message.message)
//        }
//    }
    Box(modifier = Modifier.fillMaxSize()) {
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
            SwipeRefresh(state = rememberSwipeRefreshState(isRefreshing = state.loading),
                onRefresh = {
                            getImages()
                },
                indicatorPadding = padding,
                indicator = { state, trigger ->
                    SwipeRefreshIndicator(
                            state = state,
                            refreshTriggerDistance = trigger,
                            scale = true
                        )
                    }
                ) {
                val stateList = rememberLazyListState()
                val coroutineScope = rememberCoroutineScope()

            LazyColumn(modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
                state = stateList
            ){
                item{
                    Text(state.imageList.size.toString())
                }
                item{
                    IconButton(onClick = { coroutineScope.launch {
                        stateList.scrollToItem(4800)
                    } }) {
                        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "sdasda")
                    }
                }
                items(
                    items = state.imageList
                ){item->
                    Row(modifier = Modifier.padding(10.dp)) {
                            ImageUserComponent(
                                model = item.thumbnailUrl,
                                description = item.id.toString(),
                                modifier = Modifier
                                    .size(90.dp,90.dp),
                                requestBuilder = { crossfade(true) },
                            )
                        Text(text = item.id.toString())
                    }
                        Divider(modifier = Modifier.padding(vertical = 5.dp))
                }
            }
//            val appUtil = LocalUtilApp.current
//            LazyColumn(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(padding)
//            ) {
//                items(
//                    items = pagingItems,
////                    key = {it.relations}
//                ) { caso ->
////                    Text(text = "kfmakdaskdma", modifier = Modifier.clickable {
////                        navigateToCasoDetail("1")
////                    })
//                    if (caso != null) {
//                        state.user?.let { user ->
//                            CasoItem(
//                                caso = caso.caso,
//                                rol = user.role,
//                                getEstado = { estado, rol ->
//                                    appUtil.getNameForStateCaso(estado, rol)
//                                },
//                                getPrioridad = { appUtil.getCasoPrioridad(it) },
//                                navigateToCasoDetail = { navigateToCasoDetail(it) }
//                            )
//                            Divider(
//                                color = MaterialTheme.colors.onPrimary,
//                                modifier = Modifier.padding(vertical = 20.dp)
//                            )
//                        }
//                    }
//                }
//            }
            }
        }
    }
}
