package com.company;

import java.util.ArrayList;

public class java_110_jenerics {
    public static void main(String[] args) {

        ArrayList<Integer> qw = new ArrayList();
        qw.add(56);
//        qw.add("str 1 ");  // -> when we write a Integer in <> this bracket
//        in line 8 then we can not add other data-type in that arraylist
        qw.add(565);
        qw.add(565);

        int a = (int )qw.get(2);
        System.out.println(a);



        /*

        Example of generics

        1) Integer
        2) String
        3) Character
        4) Float
        5) Double
        6) Boolean

        etc
         */

    }
}
