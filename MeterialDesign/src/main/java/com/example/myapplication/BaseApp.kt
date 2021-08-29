package com.example.myapplication

import android.app.Application
import android.content.Context

class BaseApp : Application() {
    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}