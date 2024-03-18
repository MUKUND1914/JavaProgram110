package org.example;

import java.util.*;

public class RemoveDuplicateElementInArray {
    public static void main(String []args){
        int inputArray[]={1,2,4,4,5,1,2,7,9,10};
        int tempArray[]=new int[inputArray.length];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:inputArray){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(entry.getValue()<=1){
                System.out.print(entry.getKey()+" ");
            }
        }

        System.out.println("");
        // using Collection
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("SpringBoot");
        list.add("Spring");
        list.add("Hibernate");
        System.out.println(list);
        Set<String>stringSet=new HashSet<>(list);
        System.out.println(stringSet);
    }
}
