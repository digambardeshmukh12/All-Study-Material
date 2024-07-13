package com.company;
import java.util.Scanner;
public class java_80_try_cauth {

    public static void main(String[] args) {

        System.out.println(" enter the value of a ");
        Scanner sc = new Scanner(System.in);

        int a ;

        a = sc.nextInt();


        try {
            int b = 1000/a ;
            System.out.println("the value is " + b );
        }
        catch (Exception e) {

            System.out.println(" this diivision is wrong ");
            System.out.println(" the reason is " + " ' " + e + " ' ");
        }

        System.out.println(" the end  ");

    }
}
