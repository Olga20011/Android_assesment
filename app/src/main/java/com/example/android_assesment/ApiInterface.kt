package com.example.android_assesment

import retrofit2.Call
import retrofit2.http.POST

interface ApiInterface {

    @POST("/addition")
    fun additon():Call<Numbers>

    @POST("/subtraction")
    fun subtraction():Call<Numbers>

    @POST("/division")
    fun division():Call<Numbers>

    @POST("/multiplication")
    fun multiplication():Call<Numbers>

}