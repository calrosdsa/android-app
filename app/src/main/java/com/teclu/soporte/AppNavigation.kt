package com.teclu.soporte

import androidx.compose.animation.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.teclu.casos.CasosScreen
import com.teclu.constants.LeafScreen
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
        enterTransition = { defaultEnterTransition(initialState, targetState) },
        exitTransition = { defaultExitTransition(initialState, targetState) },
        popEnterTransition = { defaultPopEnterTransition() },
        popExitTransition = { defaultPopExitTransition() },
        modifier = modifier
    ) {
        addCasosTopLevel(navController)
        composable(route = Screen.Login.route){
            LoginScreen(navController)
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
        addCasoDetail()
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addCasos(
    navController: NavController
){
    composable(
        route =LeafScreen.Casos.createRoute(Screen.Casos),
        debugLabel = "Casos()"
    ){
        TextButton(onClick = {
            navController.navigate(LeafScreen.CasoDetail.createRoute(Screen.Casos))
        }) {
            Text(text = "Navigate to Casos")
        }
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addCasoDetail(
){
    composable(
        route =LeafScreen.CasoDetail.createRoute(Screen.Casos),
        debugLabel = "Casos()"
    ){
         CasosScreen()
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
