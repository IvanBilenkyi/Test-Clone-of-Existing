package com.app.core.ch06.app01.interfaces.sample;

public class EUKatle implements Katle,Device {

    @Override
    public void pluging() {
        System.out.println("This is EU");
    }

    @Override
    public void turnOn(int timeFor) {
        System.out.println("I am bussy");
    }

    @Override
    public String turnOff() {
        return "Done";
    }

    @Override
    public String defineName() {
        return null;
    }
}
