package com.app.core.ch05.app01.abstractdata.example2;

public class ChildA extends RootItem {

    @Override
    public void doAction() {
        System.out.println("!!!!ChildA");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
