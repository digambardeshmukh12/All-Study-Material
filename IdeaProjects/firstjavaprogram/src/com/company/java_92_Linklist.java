package com.company;
import java.util.*;
public class java_92_Linklist {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new  LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>() ;

        l1.add(0,343);
        l1.add(1,213);
        l1.add(2,143);
        l1.add(3,213);

        l2.add(0,23);
        l2.add(1,21);
        l2.add(2,23);


        l1.addAll(l2);

        //        add number at first position and last position

        System.out.println("\n\n");
        l1.addFirst(435);
        l1.addLast(45);



        //        printing numbers index form 2 to 7

        System.out.println("\n\n");
        System.out.println(  l1.subList(2,7));


        //        checking a number present  in array if present gives  true else  and false


        System.out.println("\n\n");
        System.out.println(l1.contains(23));
        System.out.println(l1.contains(457));


        // seting a number on index 2 and number is 456

        System.out.println("\n\n");
        l1.set(2,456);
        System.out.println(" the number at index 2 after change is " + l1.get(2));


//         cheking index number of value

        System.out.println("\n\n");
        System.out.println(l1.lastIndexOf(23));
        System.out.println(l1.indexOf(23));




//         printing all  list

        System.out.println("\n\n");

        for (int a = 0 ; a< l1.size(); a++ ){

            System.out.println(l1.get(a));
        }


    }
}
