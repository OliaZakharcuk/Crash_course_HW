package com.company;

public class Main {

    public static void main(String[] args) {
	    Person person1 = new Person("Petro",2000);
        Person person2 = new Person();
        Person person3 = new Person("Oleg",1999);
        Person person4 = new Person("Olena", 1975);
        Person person5 = new Person("Olha", 2002);

        System.out.println(person1.age());
        person2.input();
        person2.output();

        person3.changeName("Igor");
        person3.output();

        person4.setName("Ira");
        System.out.println(person4.getName());




    }
}
