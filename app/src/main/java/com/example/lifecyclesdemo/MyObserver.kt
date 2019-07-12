package com.example.lifecyclesdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * Created by swing on 2019/7/12 0012.
 */
class MyObserver(var lifecycle: Lifecycle) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun connectOnCreate() {
        Log.e("MyObserver", "onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectOnResume() {
        Log.e("MyObserver", "onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun disConnectOnDestroy() {
        Log.e("MyObserver", "OnDestroy")
    }
}