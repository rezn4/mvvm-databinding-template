package com.app.starter.home.main

import android.os.Bundle
import com.app.starter.R
import com.app.starter.base.BaseActivity
import com.app.starter.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private val mainViewModel: MainViewModel by viewModel()

    override fun getActivityLayout(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = mainViewModel
        binding.lifecycleOwner = this


    }
}
