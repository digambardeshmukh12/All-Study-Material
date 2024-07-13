package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class java_98_calender {

    public static void main(String[] args) {

        Calendar s = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println(s.getTimeZone().getID());
        System.out.println(s.getCalendarType());

        System.out.println(s.getWeeksInWeekYear());
        System.out.println(s.getWeekYear());
    }
}
