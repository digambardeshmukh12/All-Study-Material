package com.company;

public class java_34_recursion {

    static long factorial(long a ){

        if (a<=1){
            return  1 ;
        }
        return  a*factorial(a-1) ;
    }

    static long factorial_b(long a ){

        if (a<=1){
            return  1 ;
        }
        else {
            long product = 1;
            for (long i =1 ; i<=a ; i++)
                product *= i;
            return product ;
        }

    }



    public static void main(String[] args) {


        long b = 5 ;
        System.out.println("the factorial of " + b + " is " + factorial(b));
        System.out.println("the factorial of " + b + " is " + factorial_b(b));

    }
}
