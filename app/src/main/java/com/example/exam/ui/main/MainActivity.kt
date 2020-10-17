package com.example.exam.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.exam.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val firstLogin = "tempuser@gmail.com"
    val firstPassword = "123456Qwer"

    val secondLogin = "newmain@mail.ru"
    val secondPassword = "qwerty"

    val thirdLogin = "admin@admin.kg"
    val thirdPassword = "123456"

    val fourthLogin = "gotoisbad@dd.bb"
    val fourthPassword = "todo123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListeners()
        MatchingCheck()
    }

    private fun setupListeners() {
        btnEnter.setOnClickListener {
            MatchingCheck()
        }
    }

    private fun MatchingCheck() {

        val login = etLogin.text.toString()
        val password= etPassword.text.toString()
        if (login == firstLogin&& password == firstPassword) {
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)

        }
        if(login == secondLogin && password == secondPassword){
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }
        if(login == thirdLogin && password == thirdPassword){
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }
        if(login == fourthLogin && password == fourthPassword){
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }

        else {
            Toast.makeText(applicationContext, "Sorry, the data doesn't match", Toast.LENGTH_LONG).show()
        }
    }
}