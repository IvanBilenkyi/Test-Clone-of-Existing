package com.app.core.ch07.app01.exceptions.sample2;

public class Child extends Parent {

    @Override
    public void say(String message){
        System.out.println("Good");
        throw new NullPointerException();
    }
}
