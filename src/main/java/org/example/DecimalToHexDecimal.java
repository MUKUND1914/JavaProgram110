package org.example;

public class DecimalToHexDecimal {
    public static void main(String[]args){
        int inputNumber=2000;
        int rem=0;
        String hex="";
        char [] hexDecimal={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};


        while(inputNumber>0){
            rem=inputNumber%16;
            hex=hexDecimal[rem]+hex;
            inputNumber=inputNumber/16;
        }

        System.out.println(hex);

    }
}
