package com.example.signuplibrary

import android.content.Context
import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val apiInterface: ApiInterface,
    private val appDatabase: AppDatabase
) : ViewModel() {
    val registerUser = MutableLiveData<RegisterModel>()
    val registerNameLV = MutableLiveData<String>()
    val registerMobileNumberLV = MutableLiveData<String>()
    val registerEmailLV = MutableLiveData<String>()
    val registerPasswordLV = MutableLiveData<String>()
    var allData: List<RegisterModel> = ArrayList()

    fun getRegistrationDetails(): MutableLiveData<RegisterModel> {
        return registerUser
    }

    fun getAllInsertedData(): List<RegisterModel> {
        allData = appDatabase.getRegisterDao().getAllDataRegisterSaved()
        return allData
    }

    fun onClick(context: Context) {
        val registerModel = RegisterModel(
            registerNameLV.value.toString(),
            registerMobileNumberLV.value.toString(),
            registerEmailLV.value.toString(),
            registerPasswordLV.value.toString()
        )
        apiInterface.postAllData(registerModel).enqueue(object : Callback<RegisterModel> {
            override fun onResponse(p0: Call<RegisterModel>, p1: Response<RegisterModel>) {
                println(p1.isSuccessful)
                if (p1.isSuccessful) {
                    registerUser.value = registerModel
                    appDatabase.getRegisterDao().insertDataRegisterSaved(registerModel)
                    val intent = Intent(context, LoginActivity::class.java)
                    context.startActivity(intent)
                }
            }

            override fun onFailure(p0: Call<RegisterModel>, p1: Throwable) {
                println(p1)
            }

        })
    }
}