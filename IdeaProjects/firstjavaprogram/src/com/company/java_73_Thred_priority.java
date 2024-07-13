package com.company;

class  mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }

    public void run( ) {
        int i = 0;

        while (i < 3000) {

            System.out.println(""+ this.getName());
            i++ ;
        }
    }
}
public class java_73_Thred_priority {
    public static void main(String[] args) {

        mythr1 obj1 = new mythr1("harry1 ") ;
        mythr1 obj2 = new mythr1("harry2 ") ;
        mythr1 obj3 = new mythr1("harry3 ") ;
        mythr1 obj4 = new mythr1("harry4 most imp ggdg ") ;
        mythr1 obj5 = new mythr1("harry5 ") ;


       obj4.setPriority(Thread.NORM_PRIORITY);
       obj1.start();
       obj2.start();
       obj3.start();
       obj4.start();
       obj5.start();





    }
}
