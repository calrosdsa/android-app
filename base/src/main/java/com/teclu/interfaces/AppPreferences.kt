package com.teclu.interfaces

import kotlinx.coroutines.flow.StateFlow

interface AppPreferences {
    val initialScreenStream:StateFlow<String>
    var initialScreen:String
}