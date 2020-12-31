package com.happybirthday

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Enable onclick listner to Image View
        val image = findViewById<ImageView>(R.id.background_img)

        image.setOnClickListener {
            val intent = Intent(this, HappyBirthdayGreeting::class.java)
            startActivity(intent)
        }
    }
}