package com.revision;

class key{
    public key(){
        System.out.println( "Hello ");
    }
}

class lock extends key{
    public lock(){
        super();
        System.out.println("HELLO");
    }

    public void same(){

        System.out.println("jack");
    }
}
public class superKeyword {

    public static void main(String[] args) {


        lock l = new lock();
        l.same();


    }
}
