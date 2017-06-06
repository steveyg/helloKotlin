package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by lenovo on 2017/6/6.
 */

class GenericDemo<T>(t : T){
    var value = t
}

val generic = GenericDemo(1)