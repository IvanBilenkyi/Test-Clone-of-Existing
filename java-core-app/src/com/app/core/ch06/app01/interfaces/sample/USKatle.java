package com.app.core.ch06.app01.interfaces.sample;

public class USKatle implements Katle {

    @Override
    public void pluging() {
        System.out.println("This US!");
    }

    @Override
    public void turnOn(int timeFor) {
        System.out.println("Ok, let's work for "+timeFor);
    }

    @Override
    public String turnOff() {
        return "Hey! We are ready!!!";
    }
}
