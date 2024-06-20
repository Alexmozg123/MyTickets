package ru.bortsov.mytickets

import PlatformConfiguration
import android.app.Application

class MyTicketsApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initPlatformSDK()
    }
}

fun MyTicketsApp.initPlatformSDK() =
    PlatformSDK.init(
        configuration = PlatformConfiguration(context = applicationContext)
    )