package com.app.starter.base


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.app.starter.R

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {
    lateinit var binding: T

    abstract fun getActivityLayout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getActivityLayout())
    }

    protected fun showToast(toastText: String, toastLength: Int) {
        Toast.makeText(this, toastText, toastLength).show()
    }

    protected fun showFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.cardinal, fragment)
            .commit()
    }

    protected fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.cardinal, fragment)
            .addToBackStack(null)
            .commit()
    }

}
