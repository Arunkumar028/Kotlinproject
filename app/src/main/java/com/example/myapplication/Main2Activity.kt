package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val opj=intent.getStringExtra("hai")
        Toast.makeText(applicationContext,opj+"4578",Toast.LENGTH_SHORT).show();

    }
}
