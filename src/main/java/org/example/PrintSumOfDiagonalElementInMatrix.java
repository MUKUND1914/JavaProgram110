package org.example;

public class PrintSumOfDiagonalElementInMatrix {
    public static void main(String []args){
        int arr[][]={
                {3,4,5},{1,3,4},{1,7,8}
        };
        int sum=0;

    for(int i=0;i<3;i++){
        sum+=arr[i][i];
    }
        System.out.println(sum);
    }
}
