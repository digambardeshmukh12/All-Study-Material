package com.company;

import java.util.Scanner;

public class ant_claimbing {
  static  int  p = 1 ; // p is counter of minite
    public static void main(String[] args) {
        int  a = 0 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter total number of climb  climb");
        int t = sc.nextInt() ;
        System.out.println(" enter the climb number ");
        int d = sc.nextInt() ;
        System.out.println(" enter the folling number ");
        int c = sc.nextInt();
        int f = d-c ;
        if  (f==1) {
            for (int x = t; x >= 0; x--) {
                a += d;
                p++;
                if (a == t) {
                    break;
                }
                a -= c;
            }
            System.out.println(p);
        }
        else {
            for (int x = t; x >= 0; x-=f) {
                a += d;
                p++;
                if (a == t) {
                    break;
                }
                a -= c;
            }
            System.out.println(p);

        }

    }
}
