package io.github.kevinah95

import android.app.Application
import io.github.kevinah95.di.initKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}