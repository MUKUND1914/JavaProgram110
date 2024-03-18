package org.example;

public class SumOfNumberInString {
    public static void main(String[]args){
        String s="qw25tr6tbv";
        int sum=0;
        char[] c=s.toCharArray();

        for (char value:c){
            if(Character.isDigit(value)){
                sum=sum+Character.getNumericValue(value);
            }
        }
        System.out.println(sum);
    }
}
