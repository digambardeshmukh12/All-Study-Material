package com.company;


import java.util.Scanner;

class myexception extends  Exception{


    public String toString() {
        return  " i am a tostring ";
    }


    public String getMessage() {
        return  " i am a get massage ";
    }
}

public class java_83_printtrancetrack_tostring_getmassage {



    public static void main(String[] args) {

        System.out.println(" enter the arthamatic number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

       if (a>9) {

           try {


               throw new myexception();

           }
           catch (Exception e) {


               System.out.println(e);
               System.out.println(e.getMessage());
               e.printStackTrace();

           }

       }

       else {
           System.out.println(" a is less than 9 thats whay program is end ");

       }
    }
}
