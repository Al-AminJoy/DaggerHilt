package com.alamin.daggerhilt

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepository"
class UserRepository @Inject constructor(val loggerService: LoggerService) {
    fun saveUser(email: String, password: String){
        Log.d(TAG, "Hilt saveUser: $email $password")
        loggerService.log("Success")
    }
}