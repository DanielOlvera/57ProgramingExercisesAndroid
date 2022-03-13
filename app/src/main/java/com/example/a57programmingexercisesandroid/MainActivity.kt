package com.example.a57programmingexercisesandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a57programmingexercisesandroid.view.HelloWorld57

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = HelloWorld57.newInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commitNow()
    }
}