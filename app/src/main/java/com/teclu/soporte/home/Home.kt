package com.teclu.soporte.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.teclu.constants.Screen
import com.teclu.domain.preferences.UserObject
import com.teclu.soporte.AppNavigation
import kotlinx.coroutines.flow.Flow


@OptIn(ExperimentalMaterialNavigationApi::class, ExperimentalAnimationApi::class)
@Composable
fun Home(
    user: Flow<UserObject>
){
    val userData = user.collectAsState(initial =UserObject()).value
    val initialScreen = if(userData.token.isNotBlank())Screen.Casos.route  else Screen.Login.route
    val bottomSheetNavigator = rememberBottomSheetNavigator()
    val navController = rememberAnimatedNavController(bottomSheetNavigator)
    Scaffold() {padding->
    ModalBottomSheetLayout(bottomSheetNavigator) {
        AppNavigation(
            navController = navController,
            initialScreen = initialScreen,
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        )
    }
    }


}