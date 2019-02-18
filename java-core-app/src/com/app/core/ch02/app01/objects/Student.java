package com.app.core.ch02.app01.objects;

public class Student {
    int age;
    String name;

    public void speak() {
        System.out.println("Hello, I am " + name + ". My age is " + age);
    }

    public void goToLibrary(){
        System.out.println("I am Student. My name is "+name+"! I am going to library");
    }
}
