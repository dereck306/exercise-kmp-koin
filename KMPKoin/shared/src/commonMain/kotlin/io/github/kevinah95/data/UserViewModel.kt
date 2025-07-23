package io.github.kevinah95

import io.github.kevinah95.data.UserRepository
import androidx.lifecycle.ViewModel

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun getGreeting(): String = "Hello, ${userRepository.getUsers().firstOrNull()?.name ?: "Guest"}!"
}
