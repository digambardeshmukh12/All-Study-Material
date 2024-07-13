package com.company;

interface   sam {
    void veg();
    void nonvege();
}

interface  jack extends sam{

    void    lunch();
    void    dinner();

}

class sam_and_jack implements jack{


    public void lunch(){
        System.out.println(" I have lunch");
    }

    public void dinner(){
        System.out.println(" I have dinner ");
    }

    public void veg(){
        System.out.println(" I want veg in lunch ");
    }

    public void nonvege(){
        System.out.println(" I want  nonvege in dinner ");
    }

}

public class java_58_inheritance_in_interface {

    public static void main(String[] args) {

        sam_and_jack obj = new sam_and_jack();
        System.out.println(" i am a jarry ");
        obj.dinner();
        obj.nonvege();

        System.out.println("  \n ");
        sam_and_jack obj2 = new sam_and_jack() ;

        System.out.println(" i am a tom " );
        obj2.lunch();
        obj2.veg();

    }
}
