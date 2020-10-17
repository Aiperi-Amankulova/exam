package com.example.exam.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.exam.R
import com.example.exam.data.ItemData
import com.example.exam.data.ResponseBase
import com.example.exam.data.remote.RetrofitBuilder
import com.example.exam.recycler_view.ItemListener
import com.example.exam.recycler_view.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_recycler.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecyclerActivity: AppCompatActivity(), ItemListener {
    private val adapter = RecyclerViewAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        requestNEt()
    }

    private fun requestNEt() {
        RetrofitBuilder.getService()?.getShow("1",)?.
        enqueue(object : retrofit2.Callback<ResponseBase>{
            override fun onResponse(call: Call<ResponseBase>, response: Response<ResponseBase>) {
                if (response.isSuccessful && response.body() != null)
                    adapter.update(response.body()?.data)
            }

            override fun onFailure(call: Call<ResponseBase>, t: Throwable) {
                Log.d("gdgdgdsg","dsgsdg")
            }

        })
    }

    override fun itemsClick(item: ResponseBase) {
        val intent = Intent(this,AboutActivity::class.java)
        startActivity(intent)
    }
}