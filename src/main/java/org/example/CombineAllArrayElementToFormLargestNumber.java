package org.example;

import java.util.Arrays;
import java.util.Collections;

public class CombineAllArrayElementToFormLargestNumber {
    public static void main(String []args){
        Integer []array={1,2,3,4,5,6,78};
        String result=" ";
        Collections.reverse(Arrays.asList(array));
        for(int s:array){
            result+=Integer.toString(s);
        }
        System.out.println(result);
    }
}
