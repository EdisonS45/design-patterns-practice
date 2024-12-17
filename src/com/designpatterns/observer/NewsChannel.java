package com.designpatterns.observer;

public class NewsChannel implements Channel {
    private String news;
    public void update(Object news){
        this.setNews((String) news);
    }
    public String getNews(){
        return news;
    }

    private void setNews(String news) {
        this.news=news;
    }
}
