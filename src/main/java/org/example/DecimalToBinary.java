package org.example;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int number=scanner.nextInt();
        int tempNumber=number;
        int rem=0;
        String result=" ";

        while(number>0){
            rem=number%2;
            result=rem+result;
            number/=2;
        }
        System.out.println(result);
    }
}