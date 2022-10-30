package com.teclu.soporte

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.teclu.casoDetail.CasoDetailScreen
import com.teclu.casos.CasosScreen
import com.teclu.constants.LeafScreen
import com.teclu.constants.Params
import com.teclu.constants.Screen
import com.teclu.soporte.auth.signin.LoginScreen


@ExperimentalAnimationApi
@Composable
internal fun AppNavigation(
  navController: NavHostController,
  initialScreen: String,
  modifier:Modifier = Modifier
){
    AnimatedNavHost(
        navController = navController,
        startDestination = initialScreen,
//        enterTransition = { defaultEnterTransition(initialState, targetState) },
//        exitTransition = { defaultExitTransition(initialState, targetState) },
//        popEnterTransition = { defaultPopEnterTransition() },
//        popExitTransition = { defaultPopExitTransition() },
        modifier = modifier
    ) {
        addCasosTopLevel(navController)
        composable(route = Screen.Login.route){
            LoginScreen(navController)
        }
        composableDetail(route = Screen.CasoDetail.route + "/{${Params.CASO_ID}}"){
            CasoDetailScreen()
        }
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addCasosTopLevel(
    navController: NavController
){
    navigation(
        route =Screen.Casos.route,
        startDestination = LeafScreen.Casos.createRoute(Screen.Casos)
    ){

        addCasos(navController)
        addCasoDetail(navController)
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addCasos(
    navController: NavController
){
    composableDetail(
        route =LeafScreen.Casos.createRoute(Screen.Casos),
//        debugLabel = "Casos()"
    ){
        Scaffold(modifier = Modifier.fillMaxSize()) {padding->
        Box(modifier = Modifier
            .padding(padding)
        ) {
        TextButton(onClick = {
            navController.navigate(LeafScreen.CasoDetail.createRoute(Screen.Casos))
        }) {
            Text(text = "Navigate to Casos")
        }
        }
        }
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addCasoDetail(
    navController: NavController
){
    composableDetail(
        route =LeafScreen.CasoDetail.createRoute(Screen.Casos),
//        debugLabel = "Casos()"
    ){
         CasosScreen(
             navigateToCasoDetail = {
                 navController.navigate(Screen.CasoDetail.route + "/$it")}
         )
    }
}


@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultEnterTransition(
    initial: NavBackStackEntry,
    target: NavBackStackEntry
): EnterTransition {
    val initialNavGraph = initial.destination.hostNavGraph
    val targetNavGraph = target.destination.hostNavGraph
    // If we're crossing nav graphs (bottom navigation graphs), we crossfade
    if (initialNavGraph.id != targetNavGraph.id) {
        return fadeIn()
    }
    // Otherwise we're in the same nav graph, we can imply a direction
    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.Start)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultExitTransition(
    initial: NavBackStackEntry,
    target: NavBackStackEntry
): ExitTransition {
    val initialNavGraph = initial.destination.hostNavGraph
    val targetNavGraph = target.destination.hostNavGraph
    // If we're crossing nav graphs (bottom navigation graphs), we crossfade
    if (initialNavGraph.id != targetNavGraph.id) {
        return fadeOut()
    }
    // Otherwise we're in the same nav graph, we can imply a direction
    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.Start)
}

private val NavDestination.hostNavGraph: NavGraph
    get() = hierarchy.first { it is NavGraph } as NavGraph

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopEnterTransition(): EnterTransition {
    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.End)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopExitTransition(): ExitTransition {
    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.End)
}




@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.composableDetail(
    route: String,
    content: @Composable () -> Unit,
) {

    composable(
        route = route,
        enterTransition = { slideIntoContainer(AnimatedContentScope.SlideDirection.Left,
            animationSpec = tween(500)
        )
        },
        popEnterTransition = { slideIntoContainer(AnimatedContentScope.SlideDirection.Right,
            animationSpec = tween(400)
        )
        },
        popExitTransition = { slideOutOfContainer(AnimatedContentScope.SlideDirection.Right,
            animationSpec = tween(400)
        )
        },
        exitTransition = { slideOutOfContainer(AnimatedContentScope.SlideDirection.Left,
            animationSpec = tween(500)
        )
        }
//                enterTransition = { slideInHorizontally(initialOffsetX = { 3000 }, animationSpec = tween(500))},
//        exitTransition = { slideOutHorizontally(targetOffsetX = { 3000 }, animationSpec = tween(500))},
        //       popEnterTransition = { slideInHorizontally(initialOffsetX = { 3000 }, animationSpec = tween(500))},
        //       popExitTransition= { slideOutHorizontally(targetOffsetX = { 3000 }, animationSpec = tween(500))},
    ) {
        content()
    }
}
