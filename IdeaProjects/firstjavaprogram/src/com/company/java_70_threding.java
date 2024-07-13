package com.company;

class work1 extends  Thread {

    public void run(){
        int i = 0 ;
        while ( i < 300) {
            System.out.println(" i am play pubg ");

            i++ ;

        }
    }

}

class work2 extends Thread{
    public void run() {
        int i = 0;

        while (i < 300) {

            System.out.println(" i am play cash of clan ");
     i++ ;

        }
    }
}

public class java_70_threding {

    public static void main(String[] args) {



    work1 pubg = new work1();
    work2 cash_of_clane  = new work2();

    pubg.start();
    cash_of_clane.start();

    }




}
