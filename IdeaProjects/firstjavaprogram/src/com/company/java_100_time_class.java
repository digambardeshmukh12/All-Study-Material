package com.company;


import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_100_time_class {

    public static void main(String[] args) {

       LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);


        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }

}
