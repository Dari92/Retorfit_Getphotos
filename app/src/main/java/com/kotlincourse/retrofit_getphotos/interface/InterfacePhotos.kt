package com.kotlincourse.retrofit_getphotos.`interface`

import com.kotlincourse.retrofit_getphotos.models.PhotosList
import retrofit2.Call
import retrofit2.http.GET

interface InterfacePhotos {

    @GET("/getphotos")

    fun getPhotos() : Call<PhotosList>

}