package com.steveyg.hellokotlin.helloworld.hello.kotlin

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.steveyg.hellokotlin.R
import com.steveyg.hellokotlin.helloworld.hello.java.Demo
import com.steveyg.hellokotlin.helloworld.mvp.activity.MVPActivity
import com.steveyg.hellokotlin.helloworld.oop.AttrDemo
import com.steveyg.hellokotlin.helloworld.oop.ClassDemo
import com.steveyg.hellokotlin.helloworld.oop.Direction
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var demo = ClassDemo("asd")
//        textview.text = demo.prop1;

        mvp_button.setOnClickListener {
            startActivity(Intent(MainActivity@this,MVPActivity::class.java))
        }

//        mvp_button.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        });

        Direction.EAST
        Direction.valueOf("EAST");
        Direction.values()
    }

    fun test(){

        //对于属性的操作
        var attrdemo = AttrDemo()
        attrdemo.varattr = "var attr"


    }
}
