package com.company;

class  workx implements  Runnable{

    int i = 0 ;
    public void run(){
        while (i < 200) {
            System.out.println(" this is a first interface ");
            i++ ;
        }

    }
}

class  worky implements Runnable{

    int i = 0 ;
    public void run(){
        while (i < 200) {
            System.out.println(" this is a secound interface ");
            i++;
        }

    }

}
public class java_71_threding_runneable_interface {

    public static void main(String[] args) {

        workx bulletx = new workx();
        Thread gunx = new Thread(bulletx);

        worky bullety = new worky();
        Thread guny = new Thread(bullety);

        gunx.start();
        guny.start();

    }

}
