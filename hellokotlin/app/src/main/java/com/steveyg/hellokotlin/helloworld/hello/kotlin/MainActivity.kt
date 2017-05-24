package com.steveyg.hellokotlin.helloworld.hello.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.steveyg.hellokotlin.R
import com.steveyg.hellokotlin.helloworld.hello.java.Demo
import com.steveyg.hellokotlin.helloworld.mvp.activity.MVPActivity
import com.steveyg.hellokotlin.helloworld.oop.ClassDemo
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var demo = ClassDemo("asd")
        textview.text = demo.prop1;

        mvp_button.setOnClickListener {
            startActivity(Intent(MainActivity@this,MVPActivity::class.java))
        }

    }
}