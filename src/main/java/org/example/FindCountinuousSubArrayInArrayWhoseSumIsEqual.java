package org.example;

public class FindCountinuousSubArrayInArrayWhoseSumIsEqual {
    public static void main(String[] args) {

        // How to find continuous sub array whose sum is equal to given number?

        int inputArray[] = {42, 15, 12, 8, 6, 32};
        int inputNumber = 46;
        int start = 0;
        int sum = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            sum = sum + inputArray[i];

            while (sum > inputNumber && start <= i - 1) {
                sum = sum - inputArray[start];
                start++;
            }
            if (inputNumber == sum) {
                for (int k = start; k <= i; k++) {
                    System.out.print(inputArray[k] + " ");
                }
            }
        }
    }
}
