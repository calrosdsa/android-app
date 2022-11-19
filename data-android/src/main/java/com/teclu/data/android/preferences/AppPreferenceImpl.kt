package com.teclu.data.android.preferences

import android.content.SharedPreferences
import com.teclu.constants.Screen
import com.teclu.interfaces.AppPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AppPreferenceImpl @Inject constructor(
    private val preferences:SharedPreferences
) :AppPreferences {
    override val initialScreenStream:MutableStateFlow<String>
    override var initialScreen: String by InitialScreenPreferenceDelegate("initial_screen",Screen.Casos.route)

    init{
        initialScreenStream = MutableStateFlow(initialScreen)
    }

    inner class InitialScreenPreferenceDelegate(
        private val name: String,
        private val default:String,
    ) : ReadWriteProperty<Any?, String> {

        override fun getValue(thisRef: Any?, property: KProperty<*>): String =
            preferences.getString(name, default)?:""

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            initialScreenStream.value = value
            with(preferences.edit()){
                putString(name, value)
                    .commit()
            }
        }
    }
//    inner class AccessPinPreferenceDelegate(
//        private val name: String,
//        private val default:String,
//    ) : ReadWriteProperty<Any?, String> {
//
//        override fun getValue(thisRef: Any?, property: KProperty<*>): String =
//            preferences.getString(name, default)?:""
//
//        override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//            accessPinStream.value = value
//            with(preferences.edit()){
//                putString(name, value)
//                    .commit()
//            }
//        }
//    }

}