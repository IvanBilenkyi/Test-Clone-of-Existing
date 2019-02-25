package com.app.core.ch05.app01.abstractdata.example2;

public class RootItemFactory {


    public static RootItem defineRootItem(String type){
        RootItem rootItem = null;
        if("a".equalsIgnoreCase(type)){
            rootItem = new ChildA();
        }else if("b".equalsIgnoreCase(type)){
            rootItem = new ChildB();
        }else if("c".equalsIgnoreCase(type)){
            rootItem = new ChildC();
        }
        return rootItem;
    }

    public static RootItem defineRootItem2(String type){
        if("a".equalsIgnoreCase(type)){
            return new ChildA();
        }

        if("b".equalsIgnoreCase(type)){
            return new ChildB();
        }

        if("c".equalsIgnoreCase(type)){
            return new ChildC();
        }

        return null;
    }

    public static RootItem defineRootItem3(String type){
        switch (type){
            case "a":
                return new ChildA();
            case "b":
                return new ChildB();
            case "c":
                return new ChildC();
            default: return null;
        }
    }



    /*public static RootItem defineRootItem(String type){
        Object item0 = new ChildA();
        RootItem item = new ChildA();
        ChildA item2 = new ChildA();
        item.makeStartAction();
        item0.doAction();

        switch(){

        }
    }*/
}
