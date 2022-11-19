package com.teclu.soporte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.datastore.core.DataStore
import com.teclu.data.android.preferences.UserObject
import com.teclu.interfaces.AppPreferences
import com.teclu.interfaces.AppTasks
import com.teclu.soporte.common.compose.LocalAppDateFormatter
import com.teclu.soporte.common.compose.LocalUtilApp

import com.teclu.soporte.home.Home
import com.teclu.soporte.common.compose.ui.theme.SoporteTheme
import com.teclu.soporte.composenavigator.ComposeNavigator
import com.teclu.util.AppDateFormatter
import com.teclu.util.AppUtilProvider
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.*
import java.io.IOException
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject internal lateinit var userDataStore: DataStore<UserObject>
    @Inject internal lateinit var appPreferences: AppPreferences
    @Inject internal lateinit var appDateFormatter: AppDateFormatter
    @Inject internal lateinit var appUtilProvider: AppUtilProvider
    @Inject internal lateinit var composeNavigator: ComposeNavigator
//    @Inject internal lateinit var appTasks: AppTasks

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
        installSplashScreen()
        setContent {
//            val screen = remember {
//                mutableStateOf("")
//            }
//            LaunchedEffect(key1 = true, block = {
//                userDataFlow.collect{
//                    screen.value = it.initialScreen
//                }
//            })
            CompositionLocalProvider(
                LocalAppDateFormatter provides appDateFormatter,
                LocalUtilApp provides  appUtilProvider
            ) {
            SoporteTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home(
                        appPreferences.initialScreen,
                        composeNavigator
                    )
//                    Home()
                }
            }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
//        appTasks.updateImages()
    }
}

