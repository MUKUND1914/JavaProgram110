package org.example;

public class ReverseStringButRetainTheSpace {
    public static void main(String []args){
        String s=" I Am Not a String";
        char[]inputString=s.toCharArray();
        char []reverseString=new char[inputString.length];

        for (int i=0;i<inputString.length;i++){
            if(inputString[i]==' '){
                reverseString[i]=' ';
            }
        }

        int j=inputString.length-1;
        for(int i=0;i<inputString.length;i++){
            if(inputString[i]!=' '){
                if(reverseString[j]==' '){
                    j--;
                }
                reverseString[j]=inputString[i];
                j--;
            }
        }
        System.out.println(String.valueOf(reverseString));
    }
}
