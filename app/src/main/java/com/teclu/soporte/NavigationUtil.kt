package com.teclu.soporte

import androidx.compose.animation.*
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.*
import androidx.navigation.compose.dialog
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet


@ExperimentalAnimationApi
internal fun NavGraphBuilder.composable(
    route: String,
    debugLabel: String? = null,
    arguments: List<NamedNavArgument> = emptyList(),
    deepLinks: List<NavDeepLink> = emptyList(),
    enterTransition: (AnimatedContentScope<NavBackStackEntry>.() -> EnterTransition?)? = null,
    exitTransition: (AnimatedContentScope<NavBackStackEntry>.() -> ExitTransition?)? = null,
    popEnterTransition: (AnimatedContentScope<NavBackStackEntry>.() -> EnterTransition?)? = enterTransition,
    popExitTransition: (AnimatedContentScope<NavBackStackEntry>.() -> ExitTransition?)? = exitTransition,
    content: @Composable AnimatedVisibilityScope.(NavBackStackEntry) -> Unit
) {
    composable(
        route = route,
        arguments = arguments.appendWithDebugLabel(debugLabel),
        deepLinks = deepLinks,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        popEnterTransition = popEnterTransition,
        popExitTransition = popExitTransition,
        content = content
    )
}

/**
 * Copy of Navigation-Compose `dialog()`, but with a [debugLabel] parameter.
 */
internal fun NavGraphBuilder.dialog(
    route: String,
    debugLabel: String? = null,
    arguments: List<NamedNavArgument> = emptyList(),
    deepLinks: List<NavDeepLink> = emptyList(),
    dialogProperties: DialogProperties = DialogProperties(),
    content: @Composable (NavBackStackEntry) -> Unit
) {
    dialog(
        route = route,
        arguments = arguments.appendWithDebugLabel(debugLabel),
        deepLinks = deepLinks,
        dialogProperties = dialogProperties,
        content = content
    )
}

@ExperimentalMaterialNavigationApi
internal fun NavGraphBuilder.bottomSheet(
    route: String,
    debugLabel: String? = null,
    arguments: List<NamedNavArgument> = emptyList(),
    deepLinks: List<NavDeepLink> = emptyList(),
    content: @Composable ColumnScope.(backstackEntry: NavBackStackEntry) -> Unit
) {
    bottomSheet(
        route = route,
        arguments = arguments.appendWithDebugLabel(debugLabel),
        deepLinks = deepLinks,
        content = content
    )
}

private fun List<NamedNavArgument>.appendWithDebugLabel(
    label: String? = null
): List<NamedNavArgument> = when {
    label != null -> {
        this + navArgument(DEBUG_LABEL_ARG) { defaultValue = label }
    }
    else -> this
}

private const val DEBUG_LABEL_ARG = "screen_name"

internal val NavBackStackEntry.debugLabel: String
    get() = arguments?.getString(DEBUG_LABEL_ARG) ?: "Composable"
