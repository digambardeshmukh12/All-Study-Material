package com.company;



public class java_31_method_using_static {

    static  int sum(int x , int y ){

        int z ;

        if (x>y){
        z = x+y ;
        }
        else {
            z= (x+y)*5 ;

        }

        return z ;
    }

    public static void main(String[] args) {
        int a = 5 ;
        int b = 7 ;
        int c ;
        c = sum(a,b);
        System.out.println(c);

        int p  = 9;
        int q = 7 ;
        int r ;
        r = sum(p,q );
        System.out.println(r);



    }

}
