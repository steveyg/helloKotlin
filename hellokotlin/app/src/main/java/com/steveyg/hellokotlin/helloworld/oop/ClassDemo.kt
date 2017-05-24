package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by steveyg on 2017/5/24.
 */
//没有类体的声明方式
//class ClassDemo

//主构造函数，constructor和init都可省略
//class ClassDemo constructor(type:String, var prop2: String = type){
//        var prop1 = type
//}

//二级构造函数
//class ClassDemo{
//        constructor(type:String){
//                System.out.println(type)
//        }
//}

//包含主构造函数的二级构造函数
//class ClassDemo(type:String){
//        constructor(type:String, param:String):this(type){
//                System.out.println(type + param)
//        }
//}

class ClassDemo private constructor(){

}


