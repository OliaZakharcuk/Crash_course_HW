package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        String n = reader.readLine();

        Integer n_to_int = Integer.parseInt(n);
        Integer n_cube = n_to_int * n_to_int * n_to_int;
        String n_cube_str = Integer.toString(n_cube);

        System.out.println("n = " + n_to_int);
        System.out.println("n^3 = " + n_cube);

        //Find if n is in n^3
        if (n_cube_str.indexOf(n) == -1){
            System.out.println("Number " + n + " is not in the " + n_cube_str);
        }else {
            System.out.println("Number " + n + " is in the " + n_cube_str);
        }


        //Reverte n^3
        String res = "";
        char temp;
        for( int i = 0; i < n_cube_str.length();i++)
        {
            temp = n_cube_str.charAt(i);
            res = temp + res;
        }
        Integer res_int = Integer.parseInt(res);
        System.out.println("Reverted: " + res_int);

        //Change first and last sumbol
        String new_str = "";
        temp = n_cube_str.charAt(n_cube_str.length()-1);
        new_str = new_str + temp;
        new_str = new_str + n_cube_str.substring(1,n_cube_str.length() - 1);
        temp = n_cube_str.charAt(0);
        new_str = new_str + temp;
        Integer new_str_int = Integer.parseInt(new_str);
        System.out.println("Changed first and last sumbol: " + new_str_int);

        //Add 1s
        new_str = "1";
        new_str = new_str + n_cube_str + "1";
        Integer new_str_int_with1 = Integer.parseInt(new_str);
        System.out.println("Added 1s: " + new_str_int_with1);
    }
}
