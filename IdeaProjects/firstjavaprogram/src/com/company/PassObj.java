package com.company;

class Demo1 {
    int x;
    void display(Demo1 d1) {
        System.out.println("x="+x);

    }
}
public class PassObj {
    public static void main(String[] args) {
        Demo1 d2=new Demo1();
        d2.x=90;
        Demo1 d3=new Demo1();
        d3.x=100;
        d2.display(d3);

    }
}