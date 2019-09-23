package com.app.starter.di

import com.app.starter.home.main.MainViewModel
import com.example.app.home.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var mainViewModel = module {
    viewModel {
        MainViewModel()
    }
}

var splashViewModel = module {
    viewModel {
        SplashViewModel()
    }
}

