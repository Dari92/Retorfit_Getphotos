package com.kotlincourse.retrofit_getphotos.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ServiceBuilder {
    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://2f56fd02-93f1-4033-a3e9-224277044942.mock.pstmn.io/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun<T> buildService (service: Class<T>): T{//This function will be used to connect the retrofitBuilder object with our interface and make
        //one complete retrofit call. Th interface will passed in as a parameter in this method.
        return  retrofit.create(service)
    }
}

