//
package com.company;
import java.io.*;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args) throws IOException
    {
        //1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius: ");
	    String radius = reader.readLine();
        Float radius_float = Float.parseFloat(radius);
        double area = Math.PI * (radius_float * radius_float);
        System.out.println("area : " + area);
        double circumference= Math.PI * 2*radius_float;
        System.out.println("parimetre: " + circumference);

        //2
        String name;
        String address;
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1, name.length());
        firstLetter = firstLetter.toUpperCase();
        name = firstLetter + remainingLetters;
        System.out.println("Where are you from, " + name +  "?");
        address = scanner.nextLine();
        String firstLetter2 = address.substring(0, 1);
        String remainingLetters2 = address.substring(1, address.length());
        firstLetter2 = firstLetter2.toUpperCase();
        address = firstLetter2 + remainingLetters2;
        System.out.println("Nice to meet you , " + name +  ", from " + address + "!");

        //3
        int c1_per_minute;
        int c2_per_minute;
        int c3_per_minute;
        int time1;
        int time2;
        int time3;
        System.out.println("Enter price for minute for 1 country: ");
        c1_per_minute = scanner.nextInt();
        System.out.println("Enter price for minute for 2 country: ");
        c2_per_minute = scanner.nextInt();
        System.out.println("Enter price for minute for 3 country: ");
        c3_per_minute = scanner.nextInt();
        System.out.println("Enter time of talk for 1 country: ");
        time1 = scanner.nextInt();
        System.out.println("Enter time of talk for 2 country: ");
        time2 = scanner.nextInt();
        System.out.println("Enter time of talk for 3 country: ");
        time3 = scanner.nextInt();

        System.out.println("Price for 1 talk:" + c1_per_minute * time1);
        System.out.println("Price for 2 talk:" + c2_per_minute * time2);
        System.out.println("Price for 3 talk:" + c3_per_minute * time3);

    }
}
