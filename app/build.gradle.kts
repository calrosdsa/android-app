plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)

    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt)
}
android {
    namespace = "com.teclu.soporte"

    defaultConfig {
        applicationId = "com.teclu.soporte"
        versionCode = 1
        versionName = "11"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
//            proguardFiles  getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
            proguardFiles("proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    lint {
        baseline = file("lint-baseline.xml")
        // Disable lintVital. Not needed since lint is run on CI
        checkReleaseBuilds = false
        // Ignore any tests
        ignoreTestSources = true
        // Make the build fail on any lint errors
        abortOnError = true
        // Allow lint to check dependencies
        checkDependencies = true
    }

    //
    //    applicationVariants.all {
    //        kotlin.sourceSets {
    //            getByName(name) {
    //                kotlin.srcDir("build/generated/ksp/$name/kotlin")
    //            }
    //        }
    //    }
}

dependencies {
    implementation(projects.data)
    implementation(projects.common.ui.compose)
    implementation(projects.base)
    implementation(projects.ui.auth)
    implementation(projects.dataAndroid)
    implementation(projects.domain)
    implementation(projects.ui.casos)

    implementation(libs.androidx.datastore)


    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.navigation.compose)

    implementation(libs.compose.foundation.foundation)
    implementation(libs.compose.foundation.layout)
    implementation(libs.compose.material.material)
    implementation(libs.compose.material.iconsext)
    implementation(libs.compose.animation.animation)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.material3)

    implementation(libs.accompanist.navigation.animation)
    implementation(libs.accompanist.navigation.material)

    implementation(libs.kotlin.coroutines.android)

//    implementation(libs.compose.destinations)
//    implementation(libs.animation.compose.destinations)
//    ksp(libs.ksp.compose.destinations)

    implementation(libs.hilt.library)
    implementation(libs.hilt.compose)
    kapt(libs.hilt.compiler)

    implementation(libs.hilt.work)
    kapt(libs.hilt.compiler)


    implementation(libs.retrofit.retrofit)
    implementation(libs.retrofit.gsonConverter)

    testImplementation(libs.junit)
    testImplementation(libs.robolectric)
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.androidx.test.rules)
}



android.applicationVariants.forEach { variant ->
    tasks.create("open${variant.name.capitalize()}") {
        dependsOn(tasks.named("install${variant.name.capitalize()}"))

        doLast {
            exec {
                commandLine = "adb shell monkey -p ${variant.applicationId} -c android.intent.category.LAUNCHER 1".split(" ")
            }
        }
    }
}

if (file("google-services.json").exists()) {
    apply(plugin = libs.plugins.gms.googleServices.get().pluginId)
    apply(plugin = libs.plugins.firebase.crashlytics.get().pluginId)
}

fun <T : Any> propOrDef(propertyName: String, defaultValue: T): T {
    @Suppress("UNCHECKED_CAST")
    val propertyValue = project.properties[propertyName] as T?
    return propertyValue ?: defaultValue
}
