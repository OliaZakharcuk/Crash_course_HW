package com.company;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //a (1)

          Scanner scan = new Scanner(System.in);
        System.out.println ("Enter 1 float number: ");
        float number1 = scan.nextFloat();
        System.out.println ("Enter 2 float number: ");
        float number2 = scan.nextFloat();
        System.out.println ("Enter 3 float number: ");
        float number3 = scan.nextFloat();
        if((number1 >= -5) && (number1 <= 5) ){
            System.out.println ("Number1 belong to the range (-5,5)");
        }else {
            System.out.println ("Number1 not belong to the range (-5,5)");
        }
        if((number2 >= -5) && (number2 <= 5)){
            System.out.println ("Number2 belong to the range (-5,5)");
        }else {
            System.out.println ("Number2 not belong to the range (-5,5)");
        }
        if((number3 >= -5) && (number3 <= 5)){
            System.out.println ("Number3 belong to the range (-5,5)");
        }else {
            System.out.println ("Number3 not belong to the range (-5,5)");
        }

    //a (2)

        System.out.println ("Enter 1 int number: ");
        Integer number1i = scan.nextInt();
        System.out.println ("Enter 2 int number: ");
        Integer number2i = scan.nextInt();
        System.out.println ("Enter 3 int number: ");
        Integer number3i = scan.nextInt();

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(number1i);
        myArrayList.add(number2i);
        myArrayList.add(number3i);
        Collections.sort(myArrayList);
        System.out.println ("Min number = " + myArrayList.get(0));
        System.out.println ("Max number = " + myArrayList.get(2));

    //a(3)
        enum HTTPError{
            Bad_Request(400),
            Unauthorized(401),
            Forbidden(403),
            Not_Found(404),
            Not_Acceptable(406),
            Request_Timeout(408),
            Too_Many_Requests (429),
            Internal_Server_Error(500),
            Bad_Gateway(502),
            Service_unavailable(503),
            Gateway_timeout(504);

            private int value;
            private HTTPError(int value) {
                this.value = value;
            }

        };

        System.out.println ("Enter number of error (400, 401, 403, 404, 406, 408, 429, 500, 502, 503, 504) : ");
        Integer error_number = scan.nextInt();
        HTTPError error = HTTPError.Bad_Gateway;
        boolean count = false;
        for (HTTPError err : HTTPError.values()) {
            if(err.value == error_number) {
                System.out.println(err);
                count = true;
            }

        }
        if (count == false){
            System.out.println("There is no such error! Try again!");
        }

        //b
        Dog dog1 = new Dog("Kuki", 2, Dog.Breed.AKITA);
        Dog dog2 = new Dog("Snack", 1, Dog.Breed.SPANIEL);
        Dog dog3 = new Dog("Kuki", 5, Dog.Breed.BEAGLE);
        System.out.println("We have such dogs: ");
        System.out.println(dog1.getName() + " " + dog1.getAge() + " years " + dog1.getBreed());
        System.out.println(dog2.getName() + " " + dog2.getAge() + " years " + dog2.getBreed());
        System.out.println(dog3.getName() + " " + dog3.getAge() + " years " + dog3.getBreed());
        Set<String> set_name = new HashSet<String>();


        for(Dog dog : Dog.dogs) {
            if(set_name.add(dog.getName()) == false)
                System.out.println("Two dogs have name " + dog.getName());
        }
        System.out.println("The oldest dog is  " + Dog.dogs.get(0).getAge() + " years");
        System.out.println("The oldest dog`s name is " + Dog.dogs.get(0).getName());
        System.out.println("The oldest dog`s breed is " + Dog.dogs.get(0).getBreed());







    }
}
