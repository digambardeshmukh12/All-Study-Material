package com.company;


import java.util.Scanner;

class negativeradiusexception  extends  Exception {

    @Override
    public String toString() {
        return " radius can not be negative  ";
    }

    @Override
    public String getMessage() {
        return " radius can not be negative ";


    }

}
public   class java_83_throws_thron {

    public static double area(int r) throws negativeradiusexception {
        if (r < 0) {
            throw new negativeradiusexception();

        }
        double result = Math.PI * r * r;

        return result;
    }


    public static int division(int a, int b) throws ArithmeticException {

        if (b<0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        int c = 1;

        int x , y ;

        for (int t = 0; t < c ;) {
            Scanner sc = new Scanner(System.in);
//            System.out.println(" enter the radius ");
//            c = sc.nextInt();

            System.out.println(" enter the first value ");
            x = sc.nextInt();
            System.out.println(" enter the secound  value ");
            y = sc.nextInt();


            try {

            System.out.println( " the division of " +  x  + " & " +  y  + " is " + division(x,y) );

//                double ar = area(c);
//                System.out.println(ar);


            } catch (Exception e) {
                System.out.println(e);

                System.out.println(e.getMessage());
                e.printStackTrace();

                break;


            }


            finally {
                System.out.println(" raj is king ");
            }


        }



    }

}