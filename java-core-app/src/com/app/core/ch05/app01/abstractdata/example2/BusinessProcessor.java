package com.app.core.ch05.app01.abstractdata.example2;

public class BusinessProcessor {

    public void process(ChildA childA){
        childA.sayHello();
    }

    public void process(ChildB childB){
        childB.doAction();
    }
}
