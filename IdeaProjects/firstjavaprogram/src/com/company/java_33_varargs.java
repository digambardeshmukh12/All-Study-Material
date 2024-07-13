package com.company;

public class java_33_varargs {

    static  int sum( int b , int... ar){
//        static  int sum(  int... arr){
//         in the position of ar and arr  we can use any unick name



//        avalable as int[] arr

        int result = b ;
//        int result = 0 ;


        for (int a : ar){
            result += a ;

        }

        return  result ;

    }


    public static void main(String[] args) {

        System.out.println("the sum of 4 ans 5 and 6  and 7 is " + sum(4,5, 7, 6));



    }
}
