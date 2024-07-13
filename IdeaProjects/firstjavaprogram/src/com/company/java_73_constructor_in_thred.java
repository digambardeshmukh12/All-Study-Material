package com.company;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

class myThred extends Thread{

    public myThred(String name ){

        super(name);
        System.out.println(" This is a first thred ");

    }

}
public class java_73_constructor_in_thred {
    public static void main(String[] args) {

        myThred obj = new myThred("raj ");
        myThred obj2 = new myThred("sam ") ;
        myThred obj3 = new myThred("jack ");
        obj.start();
        obj2.start();
        obj3.start();

        System.out.println(" the id of this thred is " + obj.getId() );
        System.out.println(" the name is " + obj.getName());

        System.out.println(" the id of secound id is " + obj2.getId());
        System.out.println(" the name is " + obj2.getName());

        System.out.println(" the id of secound id is " + obj3.getId());
        System.out.println(" the name is " + obj3.getName());



    }
}




