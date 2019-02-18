package com.app.core.ch04.app01.methods;

public class CalculatorChild extends Calculator {

    public int add(int a, int b){
        int sum = a+b;
        System.out.println("we are in add");
        return sum;
    }
}
