package com.example.exam.data.remote

import com.example.exam.data.ResponseBase
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("public-api/products")
    fun getShow(
        @Query("1") page :String,
    ): retrofit2.Call<RetrofitBuilder>

}