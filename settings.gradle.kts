pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
//dependencyResolutionManagement {
//    versionCatalogs {
//        create("libs") {
//            from(files("gradle/libs.versions.toml"))
//        }
//    }
//}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}

plugins {
    id("com.gradle.enterprise") version "3.11.2"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
//enableFeaturePreview("VERSION_CATALOGS")


rootProject.name = "soporte"
include (
    ":app",
    ":data",
    ":data-android",
    ":domain",
//    ":tasks",
    ":common:ui:compose",
    ":common:ui:resources",
    ":base",
    ":ui:casos",
//    ":ui:user-profile",
    ":ui:users",
    ":ui:caso-detail",
    ":ui:profile",
    ":ui:auth"

)
include(":benchmark")
