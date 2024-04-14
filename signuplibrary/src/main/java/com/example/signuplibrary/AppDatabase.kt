package com.example.signuplibrary

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RegisterModel::class/*, LoginViewModel::class*/], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getRegisterDao(): RegisterDao
//    abstract fun getLoginDao(): LoginDao
}