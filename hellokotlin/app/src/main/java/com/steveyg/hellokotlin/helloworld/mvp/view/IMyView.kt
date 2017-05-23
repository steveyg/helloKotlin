package com.steveyg.hellokotlin.helloworld.mvp.view

import com.steveyg.hellokotlin.helloworld.mvp.model.MyModel

/**
 * Created by steveyg on 17/5/23.
 */

interface IMyView{
    fun getStr(): String
    fun showSuccess(model:MyModel)
}