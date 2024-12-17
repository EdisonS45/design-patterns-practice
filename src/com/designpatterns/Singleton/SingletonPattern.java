package com.designpatterns.Singleton;

public class SingletonPattern {
    public static void main(String a[]){
        Singleton instance1= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance1==instance2);
    }




}
