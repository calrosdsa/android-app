package com.teclu.casoDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

@Composable
fun CasoDetailScreen(
){
    CasoDetailScreen(
        viewModel = hiltViewModel()
    )
}

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun CasoDetailScreen(
    viewModel: CasoDetailViewModel
){
    val state by viewModel.state.collectAsStateWithLifecycle()
    CasoDetailScreen(
        state = state,
        clearMessage = viewModel::clearMessage)
}

@Composable
internal fun CasoDetailScreen(
    state:CasoDetailState,
    clearMessage:(Long)-> Unit
){
    val scaffoldState = rememberScaffoldState()
    state.message?.let {message->
        LaunchedEffect(key1 = message, block = {
            scaffoldState.snackbarHostState.showSnackbar(message.message)
            clearMessage(message.id)
        })
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {padding->
        Column(modifier = Modifier
            .padding(padding)
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
        ){
            Text(text = "caso.titulo")
            state.casoDetail?.let {caso->
                Text(text = caso.titulo)
                Text(text = "caso.titulo")

            }
        }
    }
}