package com.example.exam.data.data2

data class DataClassS(
    val id : Int,
    val name : String,
    val description: String,
    val image: String,
    val price : String,
    val dicount_amount:String,
    val categories : List<DataClassT>
)