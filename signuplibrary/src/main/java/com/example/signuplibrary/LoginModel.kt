package com.example.signuplibrary

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login_table")
data class LoginModel(
    @PrimaryKey(autoGenerate = true)
    val userId: Int,
    val email: String,
    val password: String,
    )
