package org.example;

import java.util.Random;

public class RandomUsageExample {
    public static void main(String[]args){
        Random random=new Random();

        for(int i=0;i<5;i++){
            System.out.println("Random Integer : "+ random.nextInt());
        }
    }
}
