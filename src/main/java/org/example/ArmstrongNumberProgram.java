package org.example;

public class ArmstrongNumberProgram {
    public static void main(String[] args) {
        int number = 153;
        int remainder;
        double result = 0;
        int temp=number;

        while (temp > 0) {
            remainder = temp % 10;
            result = result + Math.pow(remainder, 3);
            temp = temp / 10;
        }
        if(number==result){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
