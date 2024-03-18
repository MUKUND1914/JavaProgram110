package org.example;

public class SelectionSort {
    public static void selectionSort(int []inputArray){
        int pos;
        int temp;
        for(int i=0;i<inputArray.length;i++){
            pos=i;
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[j]<inputArray[pos]){
                    pos=j;
                }
            }
            temp=inputArray[i];
            inputArray[i]=inputArray[pos];
            inputArray[pos]=temp;
        }
        for(int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i]+",");
        }
    }


    public static void main(String []args){
        selectionSort(new int[]{45, 84, 101, 62, 12, 45});
    }
}
