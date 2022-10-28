package com.teclu.soporte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.datastore.core.DataStore
import androidx.lifecycle.lifecycleScope
import com.teclu.domain.preferences.UserObject
import com.teclu.soporte.auth.signin.LoginScreen

import com.teclu.soporte.home.Home
import com.teclu.soporte.ui.theme.SoporteTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var userDataStore: DataStore<UserObject>

    private val userDataFlow: Flow<UserObject> by lazy {
        userDataStore.data.catch { e ->
            if (e is IOException) {
                emit(UserObject())
            } else {
                throw e
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoporteTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//            val name = remember {
//                mutableStateOf("")
//            }
//            val coroutine = rememberCoroutineScope()
//            lifecycleScope.launch {
//                userDataFlow.collect{
//                    name.value = it.username
//                }
//            }
//
//                    TextButton(onClick = {
//                        coroutine.launch {
//                            userDataStore.updateData {user->
//                                user.copy(
//                                    username = "JHON DOE"
//                                )
//                            }
//                        }
//                    }) {
//                    Text(text = name.value)
//                    }
                    Home(userDataFlow)
                }
            }
        }
    }
}

