package com.steveyg.hellokotlin.helloworld.java;

import com.steveyg.hellokotlin.helloworld.kotlin.KotlinDemo;

public class Demo {
    public String getType(){
        return "Java";
    }

    public String getKotlinType(){
        return  new KotlinDemo().getType();
    }
}
