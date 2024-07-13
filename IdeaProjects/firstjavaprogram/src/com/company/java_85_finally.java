package com.company;

public class java_85_finally {


//    ex 1

//    public static int division(int a , int b ){
//
//
//
//        try {
//            return  a/b ;
//        }
//
//        catch ( Exception e ){
//
//            System.out.println(e);
//        }
//
//        finally {
//            System.out.println( " i am foinally ");
//        }
//
//        return 0 ;
//    }



//    ex 2



    public static int division ( int a , int b ){

        return  a/b ;
    }


    public static void main(String[] args) {

//        int x = division(5,0);
//
//        System.out.println(x);


        int x = 0;


            try {
              int p =  division(20,x);
                System.out.println(p);

            }
            catch (Exception e ){
                System.out.println(e);

            }

            finally {
                System.out.println(" i am a finally ");
            }


    }
}
