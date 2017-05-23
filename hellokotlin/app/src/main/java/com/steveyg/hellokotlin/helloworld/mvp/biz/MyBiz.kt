package com.steveyg.hellokotlin.helloworld.mvp.biz

import com.steveyg.hellokotlin.helloworld.mvp.model.MyModel

/**
 * Created by steveyg on 17/5/23.
 */

class MyBiz : IMyBiz {
    override fun exec(str: String, listener: OnExecListener) {
        Thread() {
            kotlin.run {
                Thread.sleep(500)
                var model = MyModel()
                var result: String = str.toUpperCase()
                model.str = result;
                listener.execSuccess(model)
            }
        }.run()
    }

}