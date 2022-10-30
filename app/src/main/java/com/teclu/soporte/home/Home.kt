package com.teclu.soporte.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.teclu.soporte.AppNavigation


@OptIn(ExperimentalMaterialNavigationApi::class, ExperimentalAnimationApi::class)
@Composable
fun Home(
    initialScreen:String
){

//    val initialScreen = Screen.Login.route
    val bottomSheetNavigator = rememberBottomSheetNavigator()
    val navController = rememberAnimatedNavController(bottomSheetNavigator)
    Scaffold(modifier = Modifier
        .fillMaxSize()

    ) {padding->
    ModalBottomSheetLayout(bottomSheetNavigator) {
        AppNavigation(
            navController = navController,
            initialScreen = initialScreen,
            modifier = Modifier
                .padding(padding)
        )
    }
    }

}