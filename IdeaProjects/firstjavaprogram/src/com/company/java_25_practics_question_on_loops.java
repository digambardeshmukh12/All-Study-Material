package com.company;

import java.util.Scanner;

public class java_25_practics_question_on_loops {
    public static void main(String[] args) {

//        practics problem 1


//        int x = 10 ;
//        for (int a = x ; a>0 ; a--){
//            for (int b = 0 ; b<a; b++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//    practics problem 2

//        int sum = 0;
//        int n = 4;
//        int a;
//        for (a = 0; a < n; a++) {
//            sum = sum + (2 * a);
//        }
//        System.out.print("the sum of first 10 even number is ");
//        System.out.println(sum);


//        practics problem 3

//        int a = 5;
//        for (int b = 1; b <= 10; b++) {
//
//            int x = a * b;
//         //            System.out.println(a + " * " + b + " = " + x);
//            System.out.printf("%d X %d = %d \n", a,b,x);
//
//        }


//        practics problem 4

//
//        int a =10;
//        for (int b =10; b>=1;b--){
//            int x = a*b;
//         //            System.out.println(a + "*"+ b + "=" + x );
//
//            System.out.printf("%d X %d = %d \n", a,b,x);
//        }



//        practics problem 5
//
//        int  a = 5;
//        int factorial =  1;
//
//        for (int x =1 ; x <=a;x++){
//            factorial *= x;
//
//        }
//        System.out.println(factorial);





//practics problem 6

//        repeat question 5 using while loop

        System.out.println(" enter a number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int factorial = 1;
        int x = 1  ;
        while (x<=a){

            factorial *=x;


            x++;
        }
        System.out.println(factorial);





//        problem 7

//        repeat question 1 using while loop


//        int x = 10;
//        int a = x ;
//
//        while (a > 0){
//
//           for (int b = 0 ; b <a ; b++){
//
//               System.out.print("*");
//           }
//
//            a--;
//            System.out.println("\n");
//
//        }







//practics problem 8

//        yes

//        we can convert any loop in other loop

//        means we can while loop program write and exziqute in do while and for loop







//        practics problem 9

//        int a = 8;
//
//        int sum =0 ;
//        for (int b = 1; b <= 10; b++) {
//            sum += a*b ;
//
//
//        }
//        System.out.println(sum);







//        practics problem 10

//         at least one time

//         do while lopp exziqute at least one time







//        practics problem 11


//        repeat question 2 in other  one loop



//        int sum = 0;
//        int n = 100;
//        int a =0;
//        while (a<n){
//
//            sum = sum + (2*a) ;
//            a++ ;
//
//
//        }
//        System.out.print("the sum of first four even number  is : " );
//        System.out.println(sum);



    }
}