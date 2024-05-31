package org.example;

public class LargestNumber {

    public static int largestNumber(int number,int digit){
        char d =Integer.toString(digit).charAt(0);
        for(int i=number;i>0;--i){
            if(Integer.toString(i).indexOf(d)==-1){
                return i;
            }
        }
        return 0;
    }

    public static int largestNumberAlt(int number,int digit){
        char c =Integer.toString(digit).charAt(0);
        for(int i=number;i>0;i--){
            if(Integer.toString(i).indexOf(c)==-1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // How to find largest number less than a given number and without a given digit?
        int number=123;
        int digit=2;

        int result=LargestNumber.largestNumber(number,digit);
        System.out.println(result);
    }
}
