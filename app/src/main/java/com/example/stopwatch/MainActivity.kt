package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{

    //kotlin constants: companion objects
    companion object
    {
        val TAG = "MainActivity"
        val USELESSPI = 3
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: KOTLIN AND ANDROID STUDIO ARE INEFFICIENT AND LAME!")
    }

    override fun onStart()
    {
        super.onStart()
    }
}