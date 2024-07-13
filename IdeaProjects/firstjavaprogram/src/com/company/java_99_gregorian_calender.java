package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class java_99_gregorian_calender {

    public static void main(String[] args) {





GregorianCalendar g = new GregorianCalendar();

        System.out.println(g.getTime());
        System.out.println(g.getWeekYear());

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the year you have to check ");
        int x = sc.nextInt();

        System.out.println(g.isLeapYear(x));
    }

}
