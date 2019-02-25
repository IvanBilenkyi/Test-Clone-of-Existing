package com.app.core.ch06.app01.interfaces.sample;

public class Main {

    public static void main(String[] args) {
        Katle katle =  new EUKatle();
        katle.pluging();
        katle.turnOn(10);
        String res=katle.turnOff();
        System.out.println(res);
        System.out.println(Katle.MESSAGE);

        Device device = new EUKatle();
        Katle katle1 = new EUKatle();
        device.pluging();
        katle1.pluging();

    }
}
