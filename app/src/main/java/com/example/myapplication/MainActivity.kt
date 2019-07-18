package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mys="arunkumar"
        val one: Int =10145;


        Toast.makeText(applicationContext,"hai",Toast.LENGTH_LONG).show();

        val textView:TextView=findViewById(R.id.hello)
        textView.setOnClickListener {

            Toast.makeText(applicationContext,mys,Toast.LENGTH_LONG).show();
            var ins=Intent(this,Main2Activity::class.java);
            ins.putExtra("hai",mys)
            startActivity(ins)




        }

    }
}
