package org.example;

public class DiamondPattern {
    public static void main(String []args){
        // Diamond pattern printing

        int noOfRows=5;
        int temp=0;

        for(int i=noOfRows;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=temp;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
            temp++;
        }
        int temp1=noOfRows-1;
        for(int q=1;q<=noOfRows-1;q++){
            for(int w=0;w<=q;w++){
                System.out.print(" ");
            }
            for(int e=1;e<=temp1;e++ ){
                System.out.print("* ");
            }
            System.out.println("");
            temp1--;
        }
    }
}
