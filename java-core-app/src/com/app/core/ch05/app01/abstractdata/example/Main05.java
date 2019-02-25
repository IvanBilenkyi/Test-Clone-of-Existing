package com.app.core.ch05.app01.abstractdata.example;

public class Main05 {

    public static void main(String[] args) {
        MyAbstractClass myAbstractClass = new MyAbstractClass(){

        };

        MyAbstractClass myAbstractClass1 = new MyAbstractClassChild1();
        MyAbstractClassChild1 myAbstractClass2 = new MyAbstractClassChild1();
    }

}
