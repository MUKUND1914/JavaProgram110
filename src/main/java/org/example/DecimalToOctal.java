package org.example;

public class DecimalToOctal {
    public static void main(String[]args){
        int inputNumber=50;
        int rem=0;
        String octal="";
        while(inputNumber>0){
            rem=inputNumber%8;
            octal=rem+octal;
            inputNumber=inputNumber/8;
        }
        System.out.println(octal);

    }
}
