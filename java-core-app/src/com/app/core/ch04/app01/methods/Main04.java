package com.app.core.ch04.app01.methods;

public class Main04 {

    public static void main(String[] args) {
        Math.cos(1.0);

        Calculator calculator = new Calculator();
        int a = 1;
        int b = 20;
        int res=calculator.add(a, b);
        System.out.println("res="+res);
        calculator.add(2,3);
        res = 5;
        //float res =calculator.devide(10, 2);
        System.out.println("---------static method--------------");
        Calculator.doAction();
        //Calculator.add(1,2);
    }
}
