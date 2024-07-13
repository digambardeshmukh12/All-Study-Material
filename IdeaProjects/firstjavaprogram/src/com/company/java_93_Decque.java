package com.company;

import java.util.ArrayDeque;

public class java_93_Decque {

    public static void main(String[] args) {

        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        ArrayDeque<Integer> d2 = new ArrayDeque<>();
        d1.add(343);
        d1.add(213);
        d1.add(143);
        d1.add(213);

        d2.add(23);
        d2.add(21);
        d2.add(23);


        d1.addFirst(576);
        d2.addLast(67);
        d1.addLast(56);
        d2.addFirst(456);

        d1.addAll(d2);

//        System.out.println(d1.getFirst());
//        System.out.println(d1.getLast());

        for (int a = 0 ; a< d1.size(); a++) {
            System.out.println(d1.element());

        }
    }
}