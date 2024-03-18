package org.example;

public class SumOfAllDigitOfANumber {
    public static void main(String[] args) {
        int number= 745;
        int remainder;
        int result = 0;

        while(number>0){
             remainder=number%10;
             result+=remainder;
             number=number/10;
        }
        System.out.println(" Sum of all digit of given Number : "+result);
    }
}
