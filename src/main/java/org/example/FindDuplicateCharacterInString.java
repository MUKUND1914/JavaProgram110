package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacterInString {
    public static void main(String []args){
        String value="java programmer";

        char[] charArray= value.replaceAll("\\s","").toCharArray();
        Map<Character,Integer>map=new HashMap<>();
        for (char a:charArray){
            map.put(a,map.getOrDefault(a,0)+1);
        }
       for (Map.Entry<Character,Integer> a:map.entrySet()){
           if(a.getValue()>1){
               System.out.println(a.getKey()+" : "+a.getValue());
           }
       }
    }
}
