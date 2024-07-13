package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_101_date_time_formater {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // this is date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd . mm . yyyy   E    W   w    "); // this is formater



        String myDate = dt.format(dtf);
        System.out.println(myDate);

        /*

        E = date of week
        w = week of year
        W  = week of Month
         */




    }

}
