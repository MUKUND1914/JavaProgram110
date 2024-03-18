package org.example;

public class PalindromeFromGivenNumber {

    public static int reverseNumber(int num){
        int rem=0;
        int reverse=0;
        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }

        return reverse;
    }

    public static boolean checkPalindrome(int number){
        int reverseNum=reverseNumber(number);
        if(number==reverseNum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void checkAndAdd(int inputNumber){
       if(checkPalindrome(inputNumber)){
           System.out.println("Given numbers is already palindrome");
       }
       else{
           while(!checkPalindrome(inputNumber)){
               int result;
               int rev=reverseNumber(inputNumber);
               result=inputNumber+rev;
               System.out.println(inputNumber+" + "+rev+" = "+result);
               inputNumber=result;
           }
       }
    }


    public static void main(String []args){
        //How To Reverse And Add A Number Until You Get A Palindrome?
        int inputNumber=7345;
        checkAndAdd(inputNumber);
    }
}
