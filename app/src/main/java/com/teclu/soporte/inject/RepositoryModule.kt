package com.teclu.soporte.inject

import com.teclu.soporte.composenavigator.ComposeNavigator
import com.teclu.soporte.composenavigator.AppComposeNavigator
import com.teclu.data.android.preferences.AppPreferenceImpl
import com.teclu.data.android.preferences.AppUtilImpl
import com.teclu.interfaces.AppPreferences
import com.teclu.interfaces.AppUtil
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAppPreferences(appPreferenceImpl: AppPreferenceImpl):AppPreferences

    @Binds
    @Singleton
    abstract fun provideComposeNavigator(appComposeNavigator: AppComposeNavigator): ComposeNavigator

    @Binds
    @Singleton
    abstract fun provideAppUtil(appUtil: AppUtilImpl):AppUtil
}