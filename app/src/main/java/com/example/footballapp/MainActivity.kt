package com.example.footballapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var editUserName : EditText
    private lateinit var editPassword : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPassword = findViewById(R.id.et_username)
        editPassword = findViewById(R.id.et_password)


        var btnlogin = findViewById<Button>(R.id.btn_Login)


        btnLogin.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)


        }

        }
    }