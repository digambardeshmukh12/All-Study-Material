package com.company;



class  phone{
    public void call(){
        System.out.println(" we can call using it");
    }

    public void calculate(){
        System.out.println("we can use calculate problems ");
    }

}

class smartphone extends phone{


    public void calculate(){
        System.out.println("we can use calculate advance problems ");
    }


    public void movie(){
        System.out.println(" we can play movie ");
    }
}
public class java_50_dynamic_method {
    public static void main(String[] args) {

        phone obj = new smartphone();
        obj.call();
        obj.calculate();


    }
}
