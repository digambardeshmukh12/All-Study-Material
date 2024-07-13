package com.company;

import java.util.HashSet;

public class java_95_hashsheat {

    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        h1.add(343);//4
        h1.add(213);//2
        h1.add(143);//7
        h1.add(233);//6

        h2.add(23);//5
        h2.add(21);//3
        h2.add(33); //1


        h1.addAll(h2);

        System.out.println(h1);

    }
}
