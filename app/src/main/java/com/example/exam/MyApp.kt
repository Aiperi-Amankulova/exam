package com.example.exam

import android.app.Application

class MyApp(): Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }

    companion object{
        var app: MyApp? = null
    }
}