package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String []args){
        Integer array[]={1,3,5,7,9,33,58};
       Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));

    }
}
