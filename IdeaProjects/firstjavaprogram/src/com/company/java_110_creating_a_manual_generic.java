package com.company;

class generic <T , R>{

    int x ;
    T t ;
    R a ;


    public generic() {

    }

    public generic(T t , int x ,R a) {
        this.t = t;
        this.x = x;
        this.a = a;

    }

    public R getA() {
        return a;
    }

    public void setA(R a) {
        this.a = a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class java_110_creating_a_manual_generic {

    public static void main(String[] args) {

        generic<String, Integer> d = new generic("dance ", 53,566);

        String x = d.t;

        System.out.println(x);

        System.out.println(d.a);

    }
}
