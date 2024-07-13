package com.company;

import java.util.Scanner;

public class java_81_more_cauth_block_solve_exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int [] marks = new int[4];
        marks[0] = 300 ;
        marks[1] = 400 ;
        marks[2] = 500 ;
        marks[3] = 600 ;

        System.out.println(" enter the value ");

        int a = sc.nextInt();


        System.out.println(" enter  division number  ");
        int non ;
        int number = sc.nextInt(); ;


        try {
            System.out.println(" the solution is  " + marks[a] / number);

        }

        catch ( ArrayIndexOutOfBoundsException e ){
            System.out.println(" problem is a  array  exception   ");
            System.out.println(e);
        }

        catch (ArithmeticException e ){
            System.out.println(" problem is a  arthamatic exception ");
            System.out.println(e);
        }


        catch (Exception e ){
            System.out.println(" other problem is occurs  ");
            System.out.println(e);
        }
    }
}
