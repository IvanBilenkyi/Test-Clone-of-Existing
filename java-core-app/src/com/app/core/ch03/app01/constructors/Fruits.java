package com.app.core.ch03.app01.constructors;

public class Fruits extends Object {
    float price;
    String country;

    public Fruits(){
        System.out.println("Fruits.constructor");
    }

    public Fruits(float priceParameter, String countyParameter){
        price=priceParameter;
        country=countyParameter;
    }

    public Fruits(float price, String county, int amount){
        this.price=price;
        this.country=county;
    }

    @Override
    public String toString() {
        return "price="+price+"; country="+country;
        //return "price="+price+"; country="+country+"; "+super.toString();
    }
}
