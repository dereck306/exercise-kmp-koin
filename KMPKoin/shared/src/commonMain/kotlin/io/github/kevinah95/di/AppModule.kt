package io.github.kevinah95.di

import io.github.kevinah95.data.UserRepository
import org.koin.dsl.module

val appModule = module {
    single { UserRepository() }
}
