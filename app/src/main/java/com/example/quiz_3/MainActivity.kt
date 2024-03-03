package com.example.quiz_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin = findViewById<Button>(R.id.button_login)
        buttonLogin.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }

        val textForgotPassword = findViewById<TextView>(R.id.forgot_password)
        textForgotPassword.setOnClickListener {
            val intent = Intent(this, RegisterScreen::class.java)
            startActivity(intent)
        }

        val textSignUp = findViewById<TextView>(R.id.text_signup)
        textSignUp.setOnClickListener {
            val intent = Intent(this, RegisterScreen::class.java)
            startActivity(intent)
        }

        val buttonExit = findViewById<ImageView>(R.id.exit)
        buttonExit.setOnClickListener {
            this.finishAffinity()
        }
    }

}