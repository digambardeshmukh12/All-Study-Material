package com.company;

class basex{
    int x ;
    int y ;
    basex(int a  ){
        this.x = a ;
        System.out.println(" i am a consructor with value " + a );
    }
    basex(){

    }


}
class  derivedxy extends basex{

    derivedxy() {
        super(4);
        System.out.println(" i am a constructor ");
    }

}
public class java_47_super_this {

    public static void main(String[] args) {

        derivedxy x = new derivedxy();



    }

}
