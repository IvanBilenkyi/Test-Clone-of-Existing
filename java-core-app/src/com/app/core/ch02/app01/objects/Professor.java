package com.app.core.ch02.app01.objects;

public class Professor extends Person {
    String name = "Prof";

    public void teach(){
        System.out.println("Hello, I am PhD "+name+"! We are going to learn");
    }

    public void teach(String subject){
        System.out.println("We will learn "+subject);
    }

    @Override
    public void speak(){
        //super.speak();
        System.out.println("Professor. speak()");
    }
}
