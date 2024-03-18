package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        Integer[] inputArray = {21, 32, 17, 9, 7, 50, 44};
        Arrays.sort(inputArray);
//       List<Integer>list=new ArrayList<>();
//        for (int i=inputArray.length-1;i>0;i--){
//            list.add(inputArray[i]);
//        }
//        System.out.println(list);
//        int result = list.stream().skip(1).findFirst().get();
//        System.out.println(result);
        Collections.reverse(Arrays.asList(inputArray));
        List<Integer> list= Arrays.asList(inputArray);
        int result= list.stream().skip(1).findFirst().get();
        System.out.println(result);



    }
}
