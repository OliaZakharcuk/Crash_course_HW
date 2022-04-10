package com.company;

public class Chicken extends NonFlyingBird{
    String feathers = "colorful";
    boolean layEggs = true;

    public Chicken() {
        this.setFeathers(feathers);
        this.setLayEggs(layEggs);
    }
}
