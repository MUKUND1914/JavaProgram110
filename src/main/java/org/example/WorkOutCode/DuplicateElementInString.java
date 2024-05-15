package org.example.WorkOutCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementInString {
    public static void main(String []args){
        String s="hello world";
        String finalValue="";
        List<Character>characterList=new ArrayList<>();
        char[] values= s.replaceAll("//s","").toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:values){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> a:map.entrySet()){
           if(a.getValue()>1){
               characterList.add(a.getKey());
           }
        }
        System.out.println(characterList);
    }
}
