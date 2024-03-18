package org.example;

public class FindPairOfElementInArray {
    public static void main(String[] args) {
        // How To Find All Pairs of Elements In An Array Whose Sum Is Equal To A Given Number?
        int []array={1,2,5,7,9,11,15,19};
        int num=20;

        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==num){
                    System.out.println("["+array[i]+","+array[j]+"]");
                }
            }
        }
    }
}
