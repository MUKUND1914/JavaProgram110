package org.example;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "how are you Java ?";
        String[] strings = s.split("\\s");

        String reverseString="";
//            Arrays.stream(strings).iterator().forEachRemaining(a-> System.out.println(a));
//            Arrays.stream(strings).iterator().forEachRemaining(b-> System.out.println(new StringBuilder(b).reverse()));

            for(int i=0;i<strings.length;i++){
                String reverseWord = "";
                String tempString =strings[i];
                for(int j=strings[i].length()-1;j>=0;j--){
                    reverseWord+=tempString.charAt(j);
                }
                reverseString+=reverseWord+" ";
            }
        System.out.println(reverseString);
    }
}
