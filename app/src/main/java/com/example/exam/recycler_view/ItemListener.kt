package com.example.exam.recycler_view

import com.example.exam.data.ItemData
import com.example.exam.data.ResponseBase

interface ItemListener {
    fun itemsClick(item: ResponseBase)
}