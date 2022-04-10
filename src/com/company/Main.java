package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of hole: ");
        Float x = Float.parseFloat(reader.readLine());
        System.out.println("Enter the width of hole: ");
        Float y = Float.parseFloat(reader.readLine());
        System.out.println("Enter the sides of a brick: ");
        Float a = Float.parseFloat(reader.readLine());
        Float b = Float.parseFloat(reader.readLine());
        Float c = Float.parseFloat(reader.readLine());

        if (((a <= x) && (b <= y)) || ((b <= x) && (c <= y)) || ((a <= x) && (c <= y))){
            System.out.println("Your brick will go into the hole!");

        }else if (((a <= y) && (b <= x)) || ((b <= y) && (c <= x)) || ((a <= y) && (c <= x))){
            System.out.println("Your brick will go into the hole!");
        }
        else {
            System.out.println("Your brick will NO go into the hole!");
        }


    }
}
