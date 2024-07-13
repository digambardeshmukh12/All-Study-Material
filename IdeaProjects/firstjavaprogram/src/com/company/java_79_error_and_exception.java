package com.company;

import java.util.Scanner;

public class java_79_error_and_exception {
    public static void main(String[] args) {

//         syntax error
//        int a = 4;
//        int b = 5;
//         c = a+ b ; : - datatype not decleried

//         logical error

//        System.out.println(" prime number is  " +2);
//        for (int i = 1 ; i<5 ; i++) {
//
//
//            System.out.println(" prime number is  " + (2*i+1) );
//        }
//         we write a formula for prime number but here 9 is a
//         answer but 9 is not prime number
//         thats way here occurce logical error



//         run time error


       Scanner sc = new Scanner (System.in);

       int a ;
       a  = sc.nextInt();
        System.out.println(2000/a);
//        when user gives a zero value of a that time program gives a error because
//         any number divided by zero answer is not define
//        thats way this is a run time error

//         some time run time error is also called exception .
//         so many exception are found in java



    }
}
