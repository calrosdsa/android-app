
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.teclu.soporte.tasks"

    defaultConfig {
        manifestPlaceholders += mapOf(
            "appAuthRedirectScheme" to "empty"
        )
    }
}

dependencies {
    implementation(projects.base)
//    implementation(projects.data)
    implementation(projects.domain)

    api(libs.androidx.work.runtime)

    implementation(libs.hilt.library)
    kapt(libs.hilt.compiler)

    implementation(libs.hilt.work)
//    implementation(libs.androidx.work.runtime)
//    implementation(libs.hilt.work)
    kapt(libs.hilt.compiler)
}
