package com.company;


class  base2{

    base2() {
        System.out.println(" i am a simple base class constructor ");
    }
    base2(int a ){
        System.out.println(" i am a constructor with value " + a );
    }
}

class   derived2 extends base2 {
    derived2(){
        System.out.println(" i am a constructor of derived class ");
    }


    derived2( int a  ,int b ){
        super(a);

        System.out.println(" i am a constructor of derived class with a value " + b);
    }

    }
    class child2 extends  derived2{
    child2(){
        System.out.println("  I am a child constructor ");
    }

    child2( int a  ,int b , int c ){
        super(a,b);
        System.out.println(" i am a constructor of child with a value " + c );
    }

    }
public class java_46_constructor_inheritence {

    public static void main(String[] args) {

//        child2 raj = new child2();

        child2 raj = new child2( 43,56,64 );
    }
}
