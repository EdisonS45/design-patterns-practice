package com.designpatterns.Factory;

public class FactoryPattern {
    public static void main(String a[]){
        Animal cat = AnimalFactory.getAnimal("Cat");
        cat.sound();
    }
}
