package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by steveyg on 2017/5/24.
 */

//密封类
sealed class Expr {
    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}