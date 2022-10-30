package com.teclu.data.android.preferences

import androidx.datastore.core.DataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import java.io.IOException
import javax.inject.Inject

class UserPreference @Inject constructor(
    private val userDataStore: DataStore<UserObject>
) {
    suspend fun getValue(): Flow<UserObject> {
        val userData by lazy {
            userDataStore.data.catch { e ->
                if (e is IOException) {
                    emit(UserObject())
                } else {
                    throw e
                }
            }
        }
        return userData
    }
}

