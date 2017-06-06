package com.steveyg.hellokotlin.helloworld.oop

/**
 * Created by lenovo on 2017/6/6.
 */

enum class Direction {
    EAST,NORTH,SOUTH,WEST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
