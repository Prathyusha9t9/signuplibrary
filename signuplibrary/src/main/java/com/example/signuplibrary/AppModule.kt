package com.example.signuplibrary

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun getApi(): ApiInterface{
        val retrofit = Retrofit.Builder().baseUrl("https://sign-up-ca5ed-default-rtdb.firebaseio.com/").addConverterFactory(GsonConverterFactory.create()).build()
        return retrofit.create(ApiInterface::class.java)
    }

    @Provides
    @Singleton
    fun getRoomDataBase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "AppDatabase").allowMainThreadQueries().fallbackToDestructiveMigration().build()
    }

}