package com.company;

import java.util.Scanner;

public class java_82_nested_try_block {
    public static void main(String[] args) {

        int [] marks = new int[5];
        marks[0]=600;
        marks[1]=300;
        marks[2]=200;
        marks[3]=500;
        marks[4]=400;

        Scanner sc = new Scanner(System.in);
        System.out.println(" enetr the index value ");
        int num = sc.nextInt();

        System.out.println(" enter the value of number ");
        int number = sc.nextInt();
        try {
            System.out.println("the number is " + marks[num] );

        try {
            System.out.println("the division is " + marks[num]/ number );
        }

        catch (ArithmeticException e ){
            System.out.println("the problem occurece is " + e);
        }

        }

        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("the problem occurece is " + e );


        }

        catch (Exception e){
            System.out.println(" the problem is occurce ");
        }

    }
}
