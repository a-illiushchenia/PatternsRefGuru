package com.ailliushchenia.patterns.prototype;

public class PrototypeExample {
    public void showPrototype(){

        System.out.println("Hello, Prototype pattern!");

        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        fillPrototypeRegistry(prototypeRegistry);


        System.out.println("---   1   ---");
        System.out.println(prototypeRegistry.getPrototype("1"));
        System.out.println(prototypeRegistry.getPrototype("1"));
        System.out.println("hashCode is different");

        System.out.println("---   2   ---");
        System.out.println(prototypeRegistry.getPrototype("2"));
        System.out.println(prototypeRegistry.getPrototype("2"));
        System.out.println("hashCode is different");
    }

    private void fillPrototypeRegistry(PrototypeRegistry prototypeRegistry){
        prototypeRegistry.addPrototype("1", new Book("Microservices", "Kris Richardson", "2022"));
        prototypeRegistry.addPrototype("2", new Book("Joda way", "Maxim Dorofeev", "2018"));
    }
}
