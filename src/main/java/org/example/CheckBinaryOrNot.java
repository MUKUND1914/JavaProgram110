package org.example;

public class CheckBinaryOrNot {
    public static void main(String[]args){
        int binaryNumber=101001;
        boolean isBinary=true;
        int tempNumber=binaryNumber;

        while(tempNumber!=0){
            int rem=tempNumber%10;
            if(rem>1){
                isBinary=false;
                break;
            }
            else{
                tempNumber=tempNumber/10;
            }
        }
        if (isBinary){
            System.out.println("Given number is binary");
        }
        else{
            System.out.println("Given number is not binary");
        }
    }
}
