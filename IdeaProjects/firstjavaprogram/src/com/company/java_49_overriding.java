package com.company;
class   one {
    public void  onx(){
        System.out.println("its first class method one  ");
    }
    public void som(){
        System.out.println(" its first class method two ");
    }
}

class  two extends one{
    public void onx(){
        System.out.println("its secound class method one ");
    }

    public void some(){
        System.out.println(" its secound class method two ");
    }
}
public class java_49_overriding {
    public static void main(String[] args) {

        two  obj = new two() ;
        obj.som();
        obj.onx();

    }
}
