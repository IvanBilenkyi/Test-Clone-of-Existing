package com.app.core.ch05.app01.abstractdata.example2;

public class Main052 {


    public static void main(String[] args) {
        RootItem rootItem = RootItemFactory.defineRootItem("b");
        rootItem.makeStartAction();

        ChildA childA = new ChildA();
        BusinessProcessor businessProcessor = new BusinessProcessor();
        businessProcessor.process(childA);

        ChildB childB = new ChildB();
        businessProcessor.process(childB);

    }





}
