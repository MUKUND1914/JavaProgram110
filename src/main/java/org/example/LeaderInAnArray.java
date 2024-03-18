package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String []args){
        int [] inputArray={14, 9, 11, 7, 8, 5, 3};
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=inputArray.length-2;i++){
            if(inputArray[i]>inputArray[i+1]){
                list.add(inputArray[i]);
            }
        }
        list.stream().forEach(s-> System.out.println(s));
    }
}
