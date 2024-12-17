package com.designpatterns.adapter;

public class AdapterPattern {
    public static void main(String a[]){
        Car sedan = new Sedan();
        Bicycle bicycle = new Bicycle();
        sedan.drive();
        sedan.honk();
        Car bicycleAdapter = new BicycleAdapter(bicycle);
        bicycleAdapter.drive();
        bicycleAdapter.honk();
    }
}
