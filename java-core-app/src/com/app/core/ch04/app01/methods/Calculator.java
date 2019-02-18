package com.app.core.ch04.app01.methods;


public class Calculator {
    String name = "";

    public Calculator() {
        System.out.println("Calculator.constructor()");
    }

    public int add(int a, int b){
        int sum = a+b;
        System.out.println("we are in add");
        return sum;
    }

    public float devide(int a, int b){
        /*float res = a/b;
        return res;*/
        return a/b;
    }

    public static void doAction(){
        System.out.println("doAction()");
    }


}
