package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am fullycovered");
            return;
        }

        System.out.println("I am not fullycovered");
    }
}
