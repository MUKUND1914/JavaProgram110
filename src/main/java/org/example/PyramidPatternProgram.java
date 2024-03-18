package org.example;

public class PyramidPatternProgram {
    public static void main(String[] args) {
        // my own way of implementation
//        int row=5;
//        int n=5;
//        for(int i=0;i<row;i++){
//            for (int emptySpace=n-1;emptySpace>=0;emptySpace--){
//                System.out.print(" ");
//            }
//            for (int value=0;value<=i;value++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//            n--;
//        }

        //actual logic for printing pattern
        int noOfRows=5;

        int rowCount=1;

        for (int i=noOfRows;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rowCount;k++){
                System.out.print(" "+rowCount);
            }
            System.out.println(" ");
            rowCount++;
        }

    }
}
