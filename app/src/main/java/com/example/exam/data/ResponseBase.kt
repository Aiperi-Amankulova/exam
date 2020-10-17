package com.example.exam.data

import com.google.gson.annotations.SerializedName

data class ResponseBase (
    @SerializedName("code") val code : Int,
    @SerializedName("meta") val meta : Meta,
    @SerializedName("data") val data : List<ItemData>
)