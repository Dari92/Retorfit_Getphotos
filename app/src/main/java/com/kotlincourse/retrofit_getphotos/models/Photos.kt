package com.kotlincourse.retrofit_getphotos.models

class Photos (val id: Int?, val name: String?, val description: String? )

data class PhotosList (val photos: List<Photos>)