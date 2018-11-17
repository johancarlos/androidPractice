package com.example.estudiante.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar.let {
            it?.setDisplayHomeAsUpEnabled(true)
        }

        supportActionBar.let {
            it?.setDisplayShowHomeEnabled(true)
        }

        //supportActionBar.let {
        //  setSupportActionBar(toolbar)
        //}
    }
}
