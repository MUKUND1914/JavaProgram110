package org.example;

import java.util.Arrays;

public class SeparateZeroFromNonZeroNumber {
    public static void main(String[] args) {
        // How To Separate Zeros From Non-Zeros In An Array?
        int arrays[] = {14, 4, 6, 0, 0, 6, 0, 5};
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] != 0) {
                arrays[count] = arrays[i];
                count++;
            }
        }
        while (count < arrays.length) {
            arrays[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(arrays));
    }
}
