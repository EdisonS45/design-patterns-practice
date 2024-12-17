package com.designpatterns.observer;

public class ObserverApplication {
    public static void main(String a[]){
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.setNews("IND beats AUS by 7 Wickets");
        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
    }
}
