package com.steveyg.hellokotlin.helloworld.mvp.biz

import com.steveyg.hellokotlin.helloworld.mvp.model.MyModel

/**
 * Created by steveygyg on 17/5/23.
 */

interface OnExecListener{
    fun execSuccess(model:MyModel) {}
}