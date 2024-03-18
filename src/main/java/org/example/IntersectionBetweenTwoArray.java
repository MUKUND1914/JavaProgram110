package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionBetweenTwoArray {
    public static void main(String []args){
        String array1[]={"job","company","cars","bike"};
        String array2[]={"Capgemini","company","cars","waterElement"};

        Set<String>stringSet=new HashSet<>();

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i].equals(array2[j])){
                    stringSet.add(array1[i]);
                }
            }
        }
        System.out.println(stringSet);

        // Alternate method for getting common element in two array
        Integer array3[]={1,2,3,4,5,6,7};
        Integer array4[]={20,2,3,4,55,99,11};

        Set<Integer>set1=new HashSet<>(Arrays.asList(array3));
        Set<Integer>set2=new HashSet<>(Arrays.asList(array4));
        set1.retainAll(set2);
        System.out.println(set1);

    }
}
