package com.company;

import java.lang.reflect.Array;
import  java.util.*;
class java_91_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>( 56 ) ;
        ArrayList<Integer> l2 = new ArrayList<>() ;


        l1.add(0,343);
        l1.add(1,213);
        l1.add(2,143);
        l1.add(3,213);
        l2.add(0,23);
        l2.add(1,21);
        l2.add(2,23);

        l1.addAll(l2);



        //       printing numbers index form 2 to 7

        System.out.println(" printing numbers index form 2 to 7 ");
        System.out.println(  l1.subList(2,7));
        System.out.println("\n\n");


        //        checking a number present  in array if present gives  true else  and false


        System.out.println(" checking a number present  in array if present gives  true else gives false");
        System.out.println(" checking 23 is present or not ");
        System.out.println(l1.contains(23));
        System.out.println("\n\n");
        System.out.println(" checking 457 is present or not ");
        System.out.println(l1.contains(457));
        System.out.println("\n\n");

        //       seting a number on index 2 and number is 456


        System.out.println("  seting a number on index 2 and number is 456");
        l1.set(2,456);
        System.out.println(" the number on index 2 after change is " + l1.get(2));

        System.out.println("\n\n");



        //         cheking index number of number

        System.out.println("cheking index number of given value ");

        System.out.println( " index number of 213 is "+l1.lastIndexOf(213));

        System.out.println(" index number of 23 is "+l1.indexOf(23));


        System.out.println("\n\n");

//           printing array

        System.out.println(" printing whole array ");
            for (int a = 0 ; a<l1.size(); a++ ){

                System.out.print(l1.get(a));
                System.out.print(" ,");


        }



    }
}
