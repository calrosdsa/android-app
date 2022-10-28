package com.teclu.constants

sealed class Screen(val route: String) {
    object Casos : Screen("casos")
    object Users : Screen("users")
    object Profile : Screen("profile")
    object Login : Screen("login")
}



sealed class LeafScreen(
    private val route: String
) {
    fun createRoute(root: Screen) = "${root.route}/$route"

    object Casos: LeafScreen("casos")
    object CasoDetail : LeafScreen("following")
    object Trending : LeafScreen("trending")
    object Popular : LeafScreen("popular")

    object ShowDetails : LeafScreen("show/{showId}") {
        fun createRoute(root: Screen, showId: Long): String {
            return "${root.route}/show/$showId"
        }
    }

    object EpisodeDetails : LeafScreen("episode/{episodeId}") {
        fun createRoute(root: Screen, episodeId: Long): String {
            return "${root.route}/episode/$episodeId"
        }
    }

//    object ShowSeasons : LeafScreen("show/{showId}/seasons?seasonId={seasonId}") {
//        fun createRoute(
//            root: Screen,
//            showId: Long,
//            seasonId: Long? = null
//        ): String {
//            return "${root.route}/show/$showId/seasons".let {
//                if (seasonId != null) "$it?seasonId=$seasonId" else it
//            }
//        }
//    }

    object RecommendedShows : LeafScreen("recommendedshows")
    object Watched : LeafScreen("watched")
    object Search : LeafScreen("search")
    object Account : LeafScreen("account")
}