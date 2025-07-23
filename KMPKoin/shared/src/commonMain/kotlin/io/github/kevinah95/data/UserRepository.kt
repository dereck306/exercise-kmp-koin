package io.github.kevinah95.data

class UserRepository {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUsers(): List<User> = users
}