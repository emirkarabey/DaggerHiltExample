package com.example.daggerhiltexample

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServiceInstance {

    @GET("posts")
    fun getPosts() : Call<List<Post>>
}