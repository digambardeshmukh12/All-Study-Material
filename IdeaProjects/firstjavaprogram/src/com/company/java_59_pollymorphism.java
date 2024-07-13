package com.company;

interface  algebra{
    void circle () ;
    void square () ;

}

interface geometry{

    void area () ;
    void volume() ;
}

class   math implements  algebra , geometry{

    public void circle(){

        System.out.println(" i dont have any angle  ");
    }

    public void square(){
        System.out.println(" I have a four angle ");

    }

    public void area(){
        System.out.println(" i gives the area ");
    }

    public void  volume(){
        System.out.println(" i gives the volume ");
    }

}

public class java_59_pollymorphism {

    public static void main(String[] args) {

        math obj1 = new math();

        obj1.circle();
        obj1.square();
        obj1.area();
        obj1.volume();

        geometry obj2 = new math();
        obj2.area();
        obj2.volume();

        algebra obj3 = new math();

        obj3.circle();
        obj3.square();

//        obj2.circle(); ---> gives the error

    }
}
