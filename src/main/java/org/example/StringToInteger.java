package org.example;

public class StringToInteger {
    public static int myAtoi(String s) {
       try{
           StringBuilder con =new StringBuilder();
           int result = 0;
           String r = "";
           String str = "";

           boolean hasSign = false;
           if (s.contains(" ")) {
               str = s.replaceAll(" +", "");
           } else {
               str = s;
           }
           if (str.contains("-")) {
               r = str.substring(1, str.length());
               hasSign = true;
           } else {
               r = str;
           }
           char[] charArray = r.toCharArray();
           for (char c : charArray) {
               if (Character.isDigit(c)) {
                   if (c != '0') {
                       String a= con.append(c).toString();
                       result = Integer.parseInt(a);
                   }
               } else if (!Character.isDigit(c)) {
                   break;
               }
           }
           if (hasSign) {
               result *= -1;
           }

           return result;
       }
       catch (Exception e){
           return 0;
       }
    }

    public static void main(String[] args) {
        int result = myAtoi("-91283472332");
        System.out.println(result);
    }
}
