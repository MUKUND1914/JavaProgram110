package org.example;

import java.util.Arrays;

public class ReverseStringProgram {
    public static void main(String[] args) {
        // manual reverse
        String s="java program";
        StringBuilder sb=new StringBuilder();
        char[] stringArray=s.toCharArray();
        for (int i=s.length()-1;i>=0;i--){

            sb.append(stringArray[i]);
        }
        System.out.println("Manually Reversed order : "+sb);

        //Another way to reverse String
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=stringArray[i];
        }
        System.out.println("Alternate way to manually reverse a String : "+reverse);

        // Reverse using StringBuilder
        StringBuilder builder=new StringBuilder(s);
        String reversedString= builder.reverse().toString();
        System.out.println("Reversed using StringBuilder : "+reversedString);
    }
}
