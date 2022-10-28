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

@Composable
fun CasosScreen(){
   CasosScreen(viewModel = hiltViewModel())
}

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun CasosScreen(
   viewModel: CasosViewModel
){
    val state by viewModel.state.collectAsStateWithLifecycle()
    CasosScreen(
        state = state
    )
}
@Composable
internal fun CasosScreen(
    state:CasosState
){
    LaunchedEffect(key1 = true, block = {
        Log.d("DEBUG",state.toString())
    })
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.fillMaxSize()
    ) {padding->
        Column(modifier = Modifier
            .padding(padding)
            .fillMaxSize()){
//            LazyColumn(){
//                items(
//                    items = state.casos,
//                    key = {it.id}
//                ){
//                    Text(text = it.titulo, color = Color.Red)
//                    Divider(modifier = Modifier.padding(vertical =10.dp))
//
//                }
//            }
        }
    }
}

