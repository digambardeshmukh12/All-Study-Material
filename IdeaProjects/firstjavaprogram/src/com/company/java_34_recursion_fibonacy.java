package com.company;

public class java_34_recursion_fibonacy {

    static int fibonacy(int a ){

        if (a<=1){
            return  1 ;

        }
        return fibonacy(a-2)+fibonacy(a-1) ;

    }






    public static void main(String[] args) {
        int a = 9 ;
        System.out.println("the fibonacy series is  " + fibonacy(a));

    }
}
