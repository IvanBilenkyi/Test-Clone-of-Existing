package com.app.core.ch07.app01.exceptions.sample2;

public class Main2 {

    public static void main(String[] args) {
       // String s = null;
       // s.length();

        //Parent p = new Child();
        //p.say("Hello, Hey");

        try {
            //Parent p = new Parent();
            Parent p = new Child();
            p.say("Hello, Hey");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
