package com.alamin.daggerhilt

import android.util.Log

private const val TAG = "SQLRepository"
class SQLRepository: UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "Hilt saveUser: $email $password")
    }
}