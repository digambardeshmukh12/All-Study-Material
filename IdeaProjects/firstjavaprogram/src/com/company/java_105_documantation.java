package com.company;

import java.util.Scanner;

public class java_105_documantation {
    public static void main(String[] args) {

        int  a = 0 ;
        int p = 1 ;


        Scanner sc = new Scanner(System.in) ;

        System.out.println(" enter total number of climb  climb");
        int t = sc.nextInt() ;

        System.out.println(" enter the climb number ");

        int d = sc.nextInt() ;

        System.out.println(" enter the folling number ");
        int c = sc.nextInt();

        for (int x = t ; x>=0;x--){

            a+=d;
            p++;
            if (a==t){

                break;
            }
            a-=c;

            System.out.println(p);

            /*
            D:\java

            this is a address of documantation in crome files in     my pc
             
             */

        }

    }
}
