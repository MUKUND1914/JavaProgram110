package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int [] inputArray={1,2,1,1,4,5,4,3};
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int i:inputArray){
//            map.put(i, map.getOrDefault(i,0)+1);
//        }
//        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
//            if(entry.getValue()>1){
//                System.out.println("Duplicate Element : "+entry.getKey() +" , No of time : "+entry.getValue());
//            }
//        }
        Map<Integer,Integer>map=new HashMap<>();
        for (int n:inputArray){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>s:map.entrySet()){
            if(!(s.getValue() >1)){
                System.out.println("key :"+s.getKey()+" count :"+s.getValue());
            }
        }


    }
}
