package com.company;
import java.util.Scanner;
public class java_19_practics_set {
    public static void main(String[] args) {

        // question 1

//        int a = 11;
//        if (a=11){
//            System.out.println("i am 11");
//        }
//        else {
//            System.out.println("i am not 11");
//        }
        // we can not use assingment operator in if statement (=) is assingment operator

//        question 2

//        byte m1 ,m2, m3 ;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter mark in physics");
//        m1 = sc.nextByte();
//        System.out.println("enter mark in chemistry");
//        m2  = sc.nextByte();
//        System.out.println("enter mark in mathematics");
//        m3 = sc.nextByte();
//
//        float avg = ( m1 + m2 + m3 ) / 3.0f ;
//        System.out.println(" your average is " + avg);
//
//        if (avg >= 40 && m1 >= 33 && m2 >=33 && m3 >= 33){
//            System.out.println(" you are pass , congratulation ");
//        }
//        else {
//            System.out.println(" you are fail , try again next time");
//        }


//        question 3

        // hard

//        question 4
//
//        System.out.println("enter a day number ");
//        int day ;
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println(" sunday ");
//            case 2 -> System.out.println("monday ");
//            case 3 -> System.out.println(" thusday ");
//            case 4 -> System.out.println(" wensway ");
//            case 5 -> System.out.println(" thrisday ");
//            case 6 -> System.out.println("friday  ");
//            case 7 -> System.out.println("satarday");
//        }

//        question 5

//        System.out.println(" enter year ");
//        int year ;
//        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//
//        int x = year % 4 ;
//
//        if (x==0){
//            System.out.println("its a lepier year ");
//
//        }
//        else {
//            System.out.println("its not lepier year");
//        }

//        question 6


        System.out.println("enter website type");


        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();




        if (website.endsWith(".org")){
            System.out.println("its a oraganisational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("its a commersical website");
        }
        else if (website.endsWith(".in")){
            System.out.println("its a indian website");
        }
        else {
            System.out.println("its a other website");
        }

    }
}
