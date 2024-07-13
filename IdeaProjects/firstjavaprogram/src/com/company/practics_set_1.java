package com.company;

import java.util.Scanner;

public class practics_set_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" inter markes of sub1  ");
        int Sum1  = sc.nextInt();
        System.out.println(" inter markes of sub2  ");
        int Sum2  = sc.nextInt();
        System.out.println(" inter markes of sub3  ");
        int Sum3  = sc.nextInt();
        System.out.println(" inter markes of sub4  ");
        int Sum4  = sc.nextInt();
        System.out.println(" inter markes of sub5  ");
        int Sum5  = sc.nextInt();
        System.out.println(" inter markes of sub6  ");
        int Sum6  = sc.nextInt();



        int total_markes = Sum1+Sum2+Sum3+Sum4+Sum5+Sum6 ;

        System.out.println(" total markes obtain in exam are " + total_markes);

        float persentage = (total_markes * 100 )/600 ;

        System.out.println(" persentage of student are " + persentage);

    }
}
