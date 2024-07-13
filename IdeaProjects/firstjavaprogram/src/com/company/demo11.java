package com.company;

@FunctionalInterface
interface demo {
    int  show();

}

public class demo11 {
    public static void main(String[] args) {

        demo  d =  () ->{
            System.out.println("hello");
            return 0;
        };


    }
}
