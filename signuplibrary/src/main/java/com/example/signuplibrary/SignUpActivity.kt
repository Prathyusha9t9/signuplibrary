package com.example.signuplibrary

import android.content.Context
import android.content.Intent

class SignUpActivity {
    fun openActvity(context: Context){
        context.startActivity(Intent(context, RegisterActivity::class.java))
    }
}