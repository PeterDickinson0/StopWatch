package com.example.stopwatch

import android.content.res.Configuration
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

    override fun onConfigurationChanged(newConfig: Configuration)
    {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG,"onCofigurationChanged: Screen Rotated")
    }

    override fun onStart()
    {
        super.onStart()
        Log.d(TAG, "onStart: started")
    }

    override fun onResume()
    {
        super.onResume()
        Log.d(TAG, "onResume: resumed")
    }

    override fun onRestart()
    {
        super.onRestart()
        Log.d(TAG, "onRestart: restarted")
    }

    override fun onPause()
    {
        Log.d(TAG, "onPause: paused")
        super.onPause()
    }

    override fun onStop()
    {
        super.onStop()
        Log.d(TAG, "onStop: stopped")
    }

    override fun onDestroy()
    {
        super.onDestroy()
        Log.d(TAG, "onDestroy: destroyed")
    }
}