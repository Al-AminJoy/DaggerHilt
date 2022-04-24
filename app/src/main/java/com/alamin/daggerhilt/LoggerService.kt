package com.alamin.daggerhilt

import android.util.Log
import javax.inject.Inject

private const val TAG = "LoggerService"
class LoggerService @Inject constructor(){
    fun log(message: String){
        Log.d(TAG, "Hilt log: $message")
    }
}