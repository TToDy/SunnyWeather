package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by Administrator on 2020/5/12
 */
class SunnyWeatherApplication : Application() {

    companion object{
        const val TOKEN = "t40qzssvM6AXuJAD"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}