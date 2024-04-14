package com.example.signuplibrary

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RegisterDao {
    @Query("Select * from register_table")
    fun getAllDataRegisterSaved(): List<RegisterModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDataRegisterSaved(registerModel: RegisterModel)

    @Query("Delete from register_table")
    fun deleteDataRegisterSaved()
}