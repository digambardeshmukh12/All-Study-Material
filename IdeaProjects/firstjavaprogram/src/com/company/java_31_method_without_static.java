package com.company;

public class java_31_method_without_static {

    int calculate(int x, int y) {

        int z;

        if (x > y) {

            z = x - y;
        } else {
            z = x + y;
        }
        return z;
    }


    public static void main(String[] args) {
        int a= 6 ;
        int b = 7 ;
        int c ;


        int p =9 ;
        int q=6 ;
        int r ;

        java_31_method_without_static obj = new java_31_method_without_static();

        c = obj.calculate(a,b);

        r = obj.calculate(p,q );

        System.out.println( c );
        System.out.println( r  );

    }

}
