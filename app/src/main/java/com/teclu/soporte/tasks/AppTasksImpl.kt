/*
 * Copyright 2018 Google LLC
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
 */

package com.teclu.soporte.tasks

import androidx.work.*
import com.teclu.interfaces.AppTasks
import javax.inject.Inject

class AppTasksImpl @Inject constructor(
    private val workManager: WorkManager
) : AppTasks {

    override fun updateImages() {
        val request = OneTimeWorkRequest.Builder(SyncUpdateImages::class.java)
            .addTag(SyncUpdateImages.TAG)
            .build()
//            .setConstraints(
//            Constraints.Builder()
//                .setRequiredNetworkType(NetworkType.CONNECTED)
//                .setRequiresCharging(true)
//                .build()
//            )
//            .setInputData(SyncUpdateImages.buildData(images))
        workManager.beginUniqueWork(
            SyncUpdateImages.TAG,
            ExistingWorkPolicy.KEEP,
            request
        ).enqueue()
    }

    override fun updateData() {
        val request = OneTimeWorkRequestBuilder<SyncUpdateData>()
            .addTag(SyncUpdateData.TAG)
//            .setConstraints(
//            Constraints.Builder()
//                .setRequiredNetworkType(NetworkType.CONNECTED)
//                .setRequiresCharging(true)
//                .build()
//            )
//            .setInputData(SyncUpdateImages.buildData(images))
            .build()
        workManager.enqueue(request)
    }

//    override fun syncShowWatchedEpisodes(showId: Long) {
//        val request = OneTimeWorkRequestBuilder<SyncShowWatchedProgress>()
//            .addTag(SyncShowWatchedProgress.TAG)
//            .setInputData(SyncShowWatchedProgress.buildData(showId))
//            .build()
//        workManager.enqueue(request)
//    }
//
//    override fun syncFollowedShows() {
//        val request = OneTimeWorkRequestBuilder<SyncAllFollowedShows>()
//            .addTag(SyncAllFollowedShows.TAG)
//            .build()
//        workManager.enqueue(request)
//    }
//
//    override fun syncFollowedShowsWhenIdle() {
//        val request = OneTimeWorkRequestBuilder<SyncAllFollowedShows>()
//            .addTag(SyncAllFollowedShows.TAG)
//            .setConstraints(
//                Constraints.Builder()
//                    .setRequiresDeviceIdle(true)
//                    .build()
//            )
//            .build()
//        workManager.enqueue(request)
//    }
//
//    override fun setupNightSyncs() {
//        val request = PeriodicWorkRequestBuilder<SyncAllFollowedShows>(
//            repeatInterval = 24,
//            repeatIntervalTimeUnit = TimeUnit.HOURS
//        ).setConstraints(
//            Constraints.Builder()
//                .setRequiredNetworkType(NetworkType.UNMETERED)
//                .setRequiresCharging(true)
//                .build()
//        ).build()
//
//        workManager.enqueueUniquePeriodicWork(
//            SyncAllFollowedShows.NIGHTLY_SYNC_TAG,
//            ExistingPeriodicWorkPolicy.KEEP,
//            request
//        )
//    }
}
