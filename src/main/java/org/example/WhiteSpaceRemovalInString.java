package org.example;

import java.util.Arrays;

public class WhiteSpaceRemovalInString {
    public static void main(String[] args) {
        String s="Java Program";

//        String[] stringArray=s.split(" ");
//       StringBuilder builder=new StringBuilder();
//       for (String value:stringArray){
//           builder.append(value);
//       }
//        System.out.println(builder);

        //Alternative way
        String value=s.replaceAll("\\s","");
        System.out.println(value);
    }
}
