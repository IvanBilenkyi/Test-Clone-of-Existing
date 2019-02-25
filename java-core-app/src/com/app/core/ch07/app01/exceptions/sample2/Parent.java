package com.app.core.ch07.app01.exceptions.sample2;

public class Parent {

    public void say(String message) throws Exception {
        if (message.contains("Hey")) {
            throw new Exception("Incorrect message");
        }
        System.out.println("say. Parent: " + message);

    }
}
