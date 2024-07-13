package com.company;

public class java_32_method_overloading {

    String raj( String s ){


        return  s ;

    }

    int raj(int a , int b ){
        int c ;
        c = a+b;

        return c ;

    }

    int raj(int a , int b, int c ){

        int d ;
        d = a+b+c ;
        return d ;

    }

    public static void main(String[] args) {
        java_32_method_overloading obj = new java_32_method_overloading();
        int a = 54 ;
        int b = 53 ;
        int c ;
        c = obj.raj(a,b) ;

        System.out.println("the sum is " + c );

        int x = 53 ;
        int y =647;
        int z = 563;
        int k ;
        k = obj.raj(x, y,z );

        System.out.println(" yhe sum is " + k);

        String sam = "the raj is devil ";
        String ram ;

        ram = obj.raj(sam);
        System.out.println(ram  );




    }

}
