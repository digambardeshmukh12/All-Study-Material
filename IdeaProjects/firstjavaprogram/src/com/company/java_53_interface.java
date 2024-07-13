package com.company;

interface bycle{
    void breck( int drement);
    void speed(int increment) ;

}

class rockCycle implements bycle {
    public void horn(){
        System.out.println(" tring tring ");
    }

    public void breck( int drecment){
        System.out.println(" spped is decressing ");
    }
    public void speed(int increment ){
        System.out.println(" spped is incressing ");
    }
}

public class java_53_interface {
    public static void main(String[] args) {

        rockCycle obj = new rockCycle();
        obj.breck(5);
        obj.speed(9);
        obj.horn();
    }
}
