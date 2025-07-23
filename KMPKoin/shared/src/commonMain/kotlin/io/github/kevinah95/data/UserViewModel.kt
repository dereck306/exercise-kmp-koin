package io.github.kevinah95

import io.github.kevinah95.data.UserRepository

class UserViewModel(private val userRepository: UserRepository) {
    fun getGreeting(): String = "Hello, ${userRepository.getUsers().firstOrNull()?.name ?: "Guest"}!"
    fun getUsers() = userRepository.getUsers()
}