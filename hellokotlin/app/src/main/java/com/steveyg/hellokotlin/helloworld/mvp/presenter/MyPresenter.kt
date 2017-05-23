package com.steveyg.hellokotlin.helloworld.mvp.presenter

import android.os.Handler
import com.steveyg.hellokotlin.helloworld.mvp.biz.IMyBiz
import com.steveyg.hellokotlin.helloworld.mvp.biz.MyBiz
import com.steveyg.hellokotlin.helloworld.mvp.biz.OnExecListener
import com.steveyg.hellokotlin.helloworld.mvp.model.MyModel
import com.steveyg.hellokotlin.helloworld.mvp.view.IMyView


/**
 * Created by steveyg on 17/5/23.
 */

class MyPresenter(view: IMyView) {
    var myBiz: IMyBiz = MyBiz()
    var myView: IMyView? = null
    var mHandler: Handler = Handler()

    init {
        myBiz = MyBiz()
        myView = view
    }

    fun exec() {
        myBiz.exec(myView?.getStr() as String, object : OnExecListener {
            override fun execSuccess(model: MyModel) {
                System.out.println("aaaaaaaaa")
                mHandler.post(Runnable {
                    kotlin.run {
                        myView?.showSuccess(model)
                    }
                })
            }
        })

    }

}