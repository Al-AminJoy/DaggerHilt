package com.alamin.daggerhilt


interface UserRepository {
    fun saveUser(email: String, password: String)
}