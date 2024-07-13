package com.company;

public class single_inheritance {

    void eat()
    {
        System.out.println("eating ....");
    }

}

class dog extends single_inheritance
{
    void brak(){
        System.out.println("barking ....");
    }
}
class testinheritance
{
    public static void main(String[] args) {

        dog d = new dog();
        d.eat();
        d.brak();

    }
}
