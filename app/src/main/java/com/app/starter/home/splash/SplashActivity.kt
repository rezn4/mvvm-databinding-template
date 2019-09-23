package com.app.starter.home.splash

import android.content.Intent
import android.os.Bundle
import com.app.starter.R
import com.app.starter.base.BaseActivity
import com.app.starter.databinding.ActivitySplashBinding
import com.app.starter.home.main.MainActivity
import com.example.app.home.splash.SplashViewModel
import org.koin.android.ext.android.bind
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity: BaseActivity<ActivitySplashBinding>() {
    private val splashViewModel: SplashViewModel by viewModel()

    override fun getActivityLayout(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = splashViewModel
        binding.lifecycleOwner = this

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}