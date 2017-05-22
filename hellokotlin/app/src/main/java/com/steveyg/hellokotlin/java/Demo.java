package com.steveyg.hellokotlin.java;

import com.steveyg.hellokotlin.kotlin.KotlinDemo;

public class Demo {
    public String getType(){
        return "Java";
    }

    public String getKotlinType(){
        return  new KotlinDemo().getType();
    }
}
