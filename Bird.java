package com.company;

abstract public class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird() {
    }

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }


    abstract public void fly();

    public String getFeathers() {
        return feathers;
    }
    public void setFeathers(String newFeathers) {
        this.feathers = newFeathers;
    }
    public boolean getLayEggs() {
        return layEggs;
    }
    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }



}
