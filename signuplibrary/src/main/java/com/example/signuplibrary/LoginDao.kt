package com.example.signuplibrary

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LoginDao {
    @Query("Select * from login_table")
    fun getAllDataLoginSaved(): List<LoginModel>

//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun insertDataLoginSaved(loginViewModel: LoginViewModel)

    @Query("Delete from login_table")
    fun deleteDataLoginSaved()
}