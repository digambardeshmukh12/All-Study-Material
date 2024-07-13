package com.company;
import  java.util.Scanner;
public class java_18_switch_sattement {

    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age ;
        age = sc.nextInt();


        switch (age) {
            case 18:
                System.out.println("you can applies for pan");
                break;
            case 25:
                System.out.println("you can applied for marrage in court ");
                break;
            case 60:
                System.out.println("you become to retire ");
                break;
            default:
                System.out.println("enjoy your life ");
                break;
        }

        // we can use caharacter (char ) , string at age also


    }
}
