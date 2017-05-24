package com.steveyg.hellokotlin.helloworld.hello.java;

import com.steveyg.hellokotlin.helloworld.hello.kotlin.KotlinDemo;

public class Demo {
    public String getType(){
        return "Java";
    }

    public String getKotlinType(){
        return  new KotlinDemo().getType();
    }
}
