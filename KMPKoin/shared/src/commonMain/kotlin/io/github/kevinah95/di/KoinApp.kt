package io.github.kevinah95.di

import org.koin.core.context.startKoin

fun initKoin() = startKoin {
    modules(appModule)
}