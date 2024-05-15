package org.example;


import org.apache.log4j.Logger;

public class ExampleProgram {
    public static void main(String []args){

        String a="testcsv.csv";
        String[] values= a.split("\\.");
        for (String s:values) {
            System.out.println(s);
        }
    }
}
