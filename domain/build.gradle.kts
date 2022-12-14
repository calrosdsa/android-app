/*
 * Copyright 2019 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)

}

android {
    namespace = "com.teclu.domain"
}

dependencies {
    implementation(projects.base)
    api(projects.data)
    implementation(projects.dataAndroid)
//    implementation(projects.api.traktAuth)
//    implementation(projects.api.tmdb)

//    implementation(libs.androidx.datastore)
//    implementation(libs.serialization.protobuf)
//    implementation(libs.crypto.tink)


    implementation(libs.hilt.library)
//    implementation("com.google.android.gms:auth-api-impl:11.6.0")
    kapt(libs.hilt.compiler)

    api(libs.androidx.paging.common)
    api(libs.androidx.datastore)
    api(libs.retrofit.retrofit)
    api(libs.okhttp.okhttp)
    implementation(libs.androidx.paging.runtime)
}

