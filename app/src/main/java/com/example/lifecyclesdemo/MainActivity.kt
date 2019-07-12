package com.example.lifecyclesdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class MainActivity : AppCompatActivity(), LifecycleOwner {

    lateinit var lifecycleRegistry: LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleRegistry = LifecycleRegistry(this)
        val myObserver = MyObserver(lifecycle)
        lifecycle.addObserver(myObserver)
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }
}
