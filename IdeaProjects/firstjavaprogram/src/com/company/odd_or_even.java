package com.company;

import java.util.Scanner;

public class odd_or_even {

    public static void main(String[] args) {

        System.out.println("enter the if you have to check " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0 ){

            System.out.println(" its a even number ");

        }
        else {
            System.out.println(" its a odd number ");
        }

    }
}
