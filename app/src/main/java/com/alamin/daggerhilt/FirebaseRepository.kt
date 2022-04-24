package com.alamin.daggerhilt

import android.util.Log
import javax.inject.Inject

private const val TAG = "FirebaseRepository"
class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "Hilt saveUser To Firebase: $email $password")
    }
}