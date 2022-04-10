package com.company;

public class Penguin extends NonFlyingBird{
    String feathers = "blue";
    boolean layEggs = true;

    public Penguin() {
        this.setFeathers(feathers);
        this.setLayEggs(layEggs);
    }
}
