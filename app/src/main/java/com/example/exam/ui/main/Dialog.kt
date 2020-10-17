package com.example.exam.ui.main

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.exam.R
import kotlinx.android.synthetic.main.dialog.*

class Dialog(context: Context): Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)
        setCancelable(false)
        btnDialog?.setOnClickListener {
            dismiss()

        }
    }
}