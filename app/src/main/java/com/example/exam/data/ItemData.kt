package com.example.exam.data

import com.google.gson.annotations.SerializedName


data class ItemData (
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("description") val description : String,
    @SerializedName("image") val image : String,
    @SerializedName("price") val price : Double,
    @SerializedName("discount_amount") val discount_amount : Double,
    @SerializedName("status") val status : Boolean,
    @SerializedName("categories") val categories : List<Categories>
)