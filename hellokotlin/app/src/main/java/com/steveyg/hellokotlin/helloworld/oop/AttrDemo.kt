package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by lenovo on 2017/6/6.
 */

class AttrDemo{
    private var attr1 : String
    get() = attr1.toString()
    set(value) {
        attr1 = value
    }

    protected  var attr2 : String
    get() {
        //TODO GET
        return attr2.toString()
    }
    set(value) {
        attr2 = value
    }

    public var attr3 : String = "";

    var varattr : String = "";
    val valattr : String = "";

    var attr = 1;

    var attr4 : String = "" //一定要初始化
    private set
}