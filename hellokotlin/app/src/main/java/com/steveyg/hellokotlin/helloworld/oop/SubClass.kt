package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by steveyg on 2017/5/24.
 */

//open class SubClass : Base{
//    constructor(type:String) : super(type){
//        System.out.println(type)
//    }
//}

//接口
interface InterfaceDemo{
    fun funDemo(){}
}

//继承Base并且实现InterfaceDemo
class SubClass : Base(),InterfaceDemo{
    final override fun funDemo() {
        super<Base>.funDemo()
        super<InterfaceDemo>.funDemo()
    }
}
