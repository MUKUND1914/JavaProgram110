package org.example;

import java.text.DecimalFormat;

public class PercentageOfCharacters {

    public static void percentageCalculator(String inputString){
        int upperCaseCount=0;
        int lowerCaseCount=0;
        int digitCount=0;
        int others=0;

        int totalLength=inputString.length();

        for (int i=0; i<totalLength;i++){
            char c=inputString.charAt(i);
            if(Character.isUpperCase(c)){
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
            else if(Character.isDigit(c)){
                digitCount++;
            }
            else {
                others++;
            }
        }

        double upperCasePercentage=(upperCaseCount*100.0)/totalLength;
        double lowerCasePercentage=(lowerCaseCount*100.0)/totalLength;
        double digitPercentage=(digitCount*100.0)/totalLength;
        double otherPercentage=(others*100.0)/totalLength;

        DecimalFormat decimalFormat=new DecimalFormat("##.##");

        System.out.println("Input String :"+inputString);
        System.out.println("upperCasePercentage :"+decimalFormat.format(upperCasePercentage)+"%");
        System.out.println("lowerCasePercentage :"+decimalFormat.format(lowerCasePercentage)+"%");
        System.out.println("digitPercentage :"+decimalFormat.format(digitPercentage)+"%");
        System.out.println("otherPercentage :"+decimalFormat.format(otherPercentage)+"%");
        System.out.println("-----------------------------------------");


    }

    public static void main(String []args){
               PercentageOfCharacters.percentageCalculator("Tiger Runs @ The Speed Of 100 km/hour.");
    }
}
