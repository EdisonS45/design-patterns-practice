package com.designpatterns.Factory;

public class AnimalFactory {
    public static Animal getAnimal(String name){
        if(name.equalsIgnoreCase("Dog")){
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
