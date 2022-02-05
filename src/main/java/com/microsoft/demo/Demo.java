package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }
        // added comment in feature2 branch locally
        System.out.println("I am not covered");
    }
}