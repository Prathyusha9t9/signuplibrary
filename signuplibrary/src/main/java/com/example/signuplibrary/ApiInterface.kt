package com.example.signuplibrary

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("/users.json")
    fun postAllData(@Body data: RegisterModel):Call<RegisterModel>
}