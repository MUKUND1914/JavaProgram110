package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Java8FeatureDateTime {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalDateTime dateAndTime=LocalDateTime.now();
        System.out.println(dateAndTime);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(dateTimeFormatter.format(dateAndTime));

        String s="(5)";
        int i=4;
        Set seen=new HashSet<>();
        seen.add(s+i);

        System.out.println(seen);

    }
}
