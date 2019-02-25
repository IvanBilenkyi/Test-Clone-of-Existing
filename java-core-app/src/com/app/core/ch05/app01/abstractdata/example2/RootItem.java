package com.app.core.ch05.app01.abstractdata.example2;

public abstract class RootItem {

    public abstract void doAction();

    public void makeStartAction(){
        System.out.println("I am starting");
        for(int i=0;i<10;i++){
            doAction();
        }
        System.out.println("@After 10 call of doAction");
    }



}
