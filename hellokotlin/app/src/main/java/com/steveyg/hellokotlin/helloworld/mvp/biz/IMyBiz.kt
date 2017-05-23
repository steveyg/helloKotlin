package com.steveyg.hellokotlin.helloworld.mvp.biz

/**
 * Created by steveyg on 17/5/23.
 */


interface IMyBiz {
    fun exec(str: String, listener: OnExecListener)
}