package com.example.android_assesment


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {
    var retrofit=Retrofit.Builder()
        .baseUrl("http://13.244.243.129/calculator/add")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

     fun <T> buildApiClient(apiInterface: Class<T>):T{
         return retrofit.create(apiInterface)


    }

}