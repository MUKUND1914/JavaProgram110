package org.example;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {
        String a="Mother In Law";
        String b="Hitler Woman";
        String x= a.replaceAll("\\s","").toLowerCase();
        String y= b.replaceAll("\\s","").toLowerCase();

       char[] ca= x.toCharArray();
       char[] cb= y.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        String value1= Arrays.toString(ca);
        String value2= Arrays.toString(cb);
        if (value1.equals(value2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }












    }
}
