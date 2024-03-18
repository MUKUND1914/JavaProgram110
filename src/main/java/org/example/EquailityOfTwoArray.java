package org.example;

public class EquailityOfTwoArray {
    public static void main(String[] args) {
        int[] arrayOne={1,8,3,4,5,6};
        int[] arrayTwo={1,2,3,4,5,6};

        boolean equalOrNot=true;

        if(arrayOne.length==arrayTwo.length){
            for (int i=0;i<arrayOne.length;i++){
                if(arrayOne[i]!=arrayTwo[i]){
                    equalOrNot=false;
                }
            }
        }
        else {
            equalOrNot=false;
        }

        if (equalOrNot){
            System.out.println("Given array is equal");
        }
        else {
            System.out.println("Given array is not equal");
        }
    }
}
