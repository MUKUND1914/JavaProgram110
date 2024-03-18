package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfEachCharInString {
    public static void main(String[] args) {
        String input="Java Programmer";
        Map<Character,Integer>map=new HashMap<>();
        String tempString= input.replaceAll("\\s","");
        for (char c:tempString.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
