package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by lenovo on 2017/6/6.
 */

class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

val demo = Outer.Nested().foo() //==2

//class Outer {
//    private val bar: Int = 1
//    inner class Inner {
//        fun foo() = bar
//    }
//}
//
//val demo = Outer().Inner().foo() //==1