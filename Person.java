package com.company;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
public class Person {
    private String name;
    private int birthYear;
    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    // Getter
    public int getBirthYear() {
        return birthYear;
    }

    // Setter
    public void setBirthYear(int newBirthYear) {
        this.birthYear = newBirthYear;
    }
    public Person(){
    }

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public int age(){
        int year = Year.now().getValue();
        return year - this.birthYear;
    }
    public void input(){
        System.out.println ("Enter name: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
        System.out.println ("Enter year of birth: ");
        this.birthYear = scan.nextInt();
    }
    public void output(){
        System.out.println ("Name : " + this.name);
        System.out.println ("Year of birth : " + this.birthYear);

    }
    public void changeName(String newName){
        this.name = newName;

    }
}
