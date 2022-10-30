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

package com.teclu.soporte.resultentity

import com.teclu.soporte.Entry
import com.teclu.soporte.entities.CasoEntity

interface EntryWithCaso<ET : Entry> {
    var entry: ET
//    var relations: List<CasoEntity>
    var relations: List<CasoEntity>

//    var images: List<ShowTmdbImage>

    val caso: CasoEntity
        get() {
            check(relations.size == 1)
            return relations[0]
        }

//    val poster: ShowTmdbImage?

//    fun generateStableId(): Long {
//        return Objects.hash(entry::class.java.name, entry.showId).toLong()
//    }
}
