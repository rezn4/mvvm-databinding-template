package com.app.starter

import android.app.Application
import com.app.starter.di.mainViewModel
import com.app.starter.di.splashViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class StarterApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@StarterApp)
            modules(listOf(mainViewModel, splashViewModel))
        }
    }
}