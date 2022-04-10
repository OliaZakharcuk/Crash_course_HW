package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Dog implements Comparable<Dog>{
    public static ArrayList<Dog> dogs = new ArrayList <Dog>();

    private String name;
    private Integer age;
    public enum Breed{
        AKITA,
        TERRIER,
        SPANIEL,
        BEAGLE;

    };
    private Breed breed;

    public String getName(){
        return name;
    }

    public void setName(String a){
        name=a;
    }
    public Integer getAge(){
        return age;
    }

    public void setAge(Integer a){
        age = a;
    }
    public Breed getBreed(){
        return breed;
    }

    public void setBreed(Breed a){
        breed = a;
    }
    @Override
    public int compareTo(Dog e) {
        return this.getAge().compareTo(e.getAge());
    }
    public Dog(String name, Integer age, Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
        dogs.add(this);
        Collections.sort(dogs,Collections.reverseOrder());

    }

}
