package com.steveyg.hellokotlin.helloworld.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.steveyg.hellokotlin.R
import com.steveyg.hellokotlin.helloworld.java.Demo
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var demo = Demo();
        textview.text = demo.kotlinType;

    }
}
