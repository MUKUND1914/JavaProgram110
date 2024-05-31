package org.example;

public class MissingElementInArray {
    public static int sumOfNElement(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Java Program To Find Missing Number In An Array
        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int sumOfNElement = sumOfNElement(n);
        int sumOfArray = sumOfArray(a);
        int missingElement=sumOfNElement-sumOfArray;
        System.out.println("Missing number in Array :"+missingElement);
    }
}
