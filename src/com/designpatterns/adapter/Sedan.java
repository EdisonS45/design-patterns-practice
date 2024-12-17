package com.designpatterns.adapter;

public class Sedan implements Car{
    public void drive(){
        System.out.println("Sedan is driving");
    }
    public void honk(){
        System.out.println("Sedan honks: Beep Beep!");
    }
}
