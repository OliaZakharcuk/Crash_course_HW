package com.company;
import java.io.*;
import java.io.IOException;

public class Main {

    public static double div(double number1, double number2){
        return number1 / number2;
    }
    public static int readNumber(int start, int end) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter number: ");

        try {
            Integer number = Integer.parseInt(br.readLine());
            if((number >= start) && (number <= end)){
                return number;
            }else  {
                throw new IOException("Number should be an integer type in range[ " + start + ", " + end + "]");
            }
        }catch (NumberFormatException e){
            System.out.println("Number should be an integer type in range[ " + start + ", " + end + "]");
        }

        return 0;

    }

    public static void main(String[] args) {
        double number1 = 5.5;
        double number2 = 1.5;
        try {
            double res = div(number1, number2);
            System.out.println(res);
        }
        catch (Exception e){
            e.getStackTrace();
        }
        try {
            Integer res2 = readNumber(1,10);
            System.out.println(res2);
        }catch (Exception e){
            System.out.println(e);
        }





	// write your code here
    }
}
