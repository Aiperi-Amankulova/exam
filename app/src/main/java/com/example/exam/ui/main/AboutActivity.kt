package com.example.exam.ui.main

import android.app.AlertDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exam.R
import com.example.exam.data.ItemData

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
//        val item = intent.getParcelableExtra<ItemData>("data")
//        tvProductName.text = item?.name
//        tvDescription.text = item?.description
//        tvPrice.text = item?.price?.toShort().toString()
//
//        btnB0uy.setOnClickListener {
//            AlertDialog(this).show()
//        }
    }
}