package com.example.signuplibrary

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "register_table")
data class RegisterModel(
    val name: String,
    val mobileNumber: String,
    val email: String,
    val password: String,
    ){
    @PrimaryKey(autoGenerate = true)
    var userId: Int? = null
}
