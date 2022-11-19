package com.teclu.soporte.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.teclu.soporte.AppNavigation
import com.teclu.soporte.composenavigator.ComposeNavigator


@OptIn(ExperimentalMaterialNavigationApi::class, ExperimentalAnimationApi::class)
@Composable
fun Home(
    initialScreen:String,
    composeNavigator: ComposeNavigator
){

//    val initialScreen = Screen.Login.route
    val bottomSheetNavigator = rememberBottomSheetNavigator()
    val navController = rememberAnimatedNavController(bottomSheetNavigator)
    ModalBottomSheetLayout(bottomSheetNavigator) {
        AppNavigation(
            navController = navController,
            initialScreen = initialScreen,
            modifier = Modifier.fillMaxHeight(),
            composeNavigator = composeNavigator
        )
    }
}