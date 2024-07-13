package com.company;

public class java_45_inheritance {

    int legs ;
    String sound ;
    String  name ;


     String  setName(String n) {
        name = n;

        return name;
    }


    void getName() {

        System.out.println(" my name is " + name);

    }



    int setlegs(int a ){

        legs = a ;

    return legs;
    }


    void getlegs(){

        System.out.println( " i have "+ legs + " legs");
    }



    String setsound( String s ){

        sound = s ;

        return sound ;
    }



    void getsound(){
        System.out.println(" my sound is "+ sound);
    }

}

class dogx extends java_45_inheritance{
    String charactor ;


    String setcharactor( String s){
        charactor = s ;
        return  charactor ;
    }
    void getCharactor(){
        System.out.println(" my charactor is " + charactor);
    }







}

class test{

    public static void main(String[] args) {
        dogx tony = new dogx() ;



        tony.setName("tony ");
        tony.getName();
        tony.setlegs(4) ;
        tony.getlegs();
        tony.setsound( "  bho - bho ");
        tony.getsound();
        tony.setcharactor(" lovely  ");
        tony.getCharactor();
    }
}