package com.example.footballapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textusername :TextView
    private lateinit var textpassword :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        textusername = findViewById(R.id.tv_username)
        textpassword = findViewById(R.id.tv_password)

        val username = intent.getStringArrayListExtra("username")
        val password = intent.getStringExtra("password")

        textusername.text = "username : "+username
        textpassword.text = "password : "+password

    }
}