package com.app.core.ch03.app01.constructors;

public class Main03 {

    public static void main(String[] args) {
        //Fruits fruits = new Fruits();
        RedApple redApple = new RedApple();
        RedApple redApple1 = new RedApple();
        new RedApple();
        System.out.println("-----------------");
        Fruits fruits = new Fruits();
        fruits.country="UA";
        fruits.price=35.0F;
        System.out.println("------Constructor overload-----------");
        Fruits fruitsA = new Fruits(45.0f, "UK");
        String textValue = fruitsA.toString();
        System.out.println(textValue);

        String text = "price: "+fruitsA.price+"; country:"+fruitsA.country;
        System.out.println(text);

    }
}
